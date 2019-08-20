package edu.escuelaing.arem.ASE.app.entities.responses;

import com.google.gson.annotations.SerializedName;

public class StatisticCalculationResponse {
    private double mean;
    @SerializedName("standard_deviation")
    private double standardDeviation;

    public StatisticCalculationResponse(double mean, double standardDeviation) {
        this.mean = mean;
        this.standardDeviation = standardDeviation;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    @Override
    public String toString() {
        return String.format("StatisticCalculationResponse:{\n Mean: %.2f\n Standard deviation: %.2f}", mean, standardDeviation);
    }
}
