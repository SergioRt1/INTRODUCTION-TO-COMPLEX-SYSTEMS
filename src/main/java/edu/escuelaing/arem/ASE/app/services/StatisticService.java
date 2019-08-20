package edu.escuelaing.arem.ASE.app.services;

import edu.escuelaing.arem.ASE.app.entities.responses.StatisticCalculationResponse;
import edu.escuelaing.arem.ASE.app.statistic.StatisticCalculator;
import edu.escuelaing.arem.ASE.app.utils.List;

public class StatisticService {

    public double calculateMean(List<Float> data) {
        return StatisticCalculator.calculateMean(data);
    }

    public double calculateStandardDeviation(List<Float> data) {
        return StatisticCalculator.calculateStandardDeviation(data);
    }

    public StatisticCalculationResponse calculateMeanAndStandardDeviation(List<Float> data) {
        double mean = StatisticCalculator.calculateMean(data);
        double standardDeviation = StatisticCalculator.calculateStandardDeviation(data, mean);

        return new StatisticCalculationResponse(mean, standardDeviation);
    }

}
