package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.controllers.StatisticController;
import edu.escuelaing.arem.ASE.app.services.StatisticService;
import edu.escuelaing.arem.ASE.app.statistic.StatisticCalculator;
import edu.escuelaing.arem.ASE.app.utils.FileReader;
import edu.escuelaing.arem.ASE.app.utils.List;
import spark.Spark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.NoSuchFileException;

/**
 * App starter
 */
public class App {
    public static void main(String[] args) {
        Spark.port(getPort());
        new StatisticController(new StatisticService());
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }

        return 4567; //returns default port if heroku-port isn't set
    }

    public static void consoleApp(){
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = buffer.readLine();
            List<Float> data = FileReader.getDataFromFile(fileName);
            double mean = StatisticCalculator.calculateMean(data);
            double standardDeviation = StatisticCalculator.calculateStandardDeviation(data, mean);

            String output = String.format("Input: %s\nMean: %.2f\nStandard deviation: %.2f", data, mean, standardDeviation);
            System.out.println(output);
        } catch (NoSuchFileException e) {
            System.out.println("File not found in the path: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Unexpected error in the input provide");
        }
    }
}
