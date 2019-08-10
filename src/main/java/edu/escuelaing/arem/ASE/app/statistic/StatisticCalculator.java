package edu.escuelaing.arem.ASE.app.statistic;

import edu.escuelaing.arem.ASE.app.utils.List;

/**
 * Provide function to do statistic calculations.
 */
public class StatisticCalculator {
    /**
     * Calculate the mean of a given data set.
     *
     * @param data
     * @return mean
     */
    public static double calculateMean(List<Float> data) {
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }

        return sum / data.size();
    }

    /**
     * Calculate the standard deviation of a given data set.
     *
     * @param data
     * @param mean
     * @return standard deviation
     */
    public static double calculateStandardDeviation(List<Float> data, double mean) {
        float sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (data.get(i) - mean) * (data.get(i) - mean);
        }

        return Math.sqrt(sum / (data.size() - 1));
    }
}
