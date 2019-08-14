package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.statistic.StatisticCalculator;
import edu.escuelaing.arem.ASE.app.utils.FileReader;
import edu.escuelaing.arem.ASE.app.utils.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;

/**
 * Unit test App
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Read test file DevelopmentHours
     */
    public void testDevelopmentHours() throws IOException {
        String path = "src/test/java/edu/escuelaing/arem/ASE/files/DevelopmentHours.txt";
        List<Float> data = FileReader.getDataFromFile(path);
        double mean = StatisticCalculator.calculateMean(data);
        double standardDeviation = StatisticCalculator.calculateStandardDeviation(data, mean);

        assertEquals(60.32, mean, 1e-1);
        assertEquals(62.26, standardDeviation, 1e-2);
    }

    public void testEstimateProxySize() throws IOException {
        String path = "src/test/java/edu/escuelaing/arem/ASE/files/EstimateProxySize.txt";
        List<Float> data = FileReader.getDataFromFile(path);
        double mean = StatisticCalculator.calculateMean(data);
        double standardDeviation = StatisticCalculator.calculateStandardDeviation(data, mean);

        assertEquals(550.6, mean, 1e-1);
        assertEquals(572.03, standardDeviation, 1e-2);
    }
}
