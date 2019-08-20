package edu.escuelaing.arem.ASE.app.controllers;

import com.google.gson.reflect.TypeToken;
import edu.escuelaing.arem.ASE.app.Router;
import edu.escuelaing.arem.ASE.app.services.StatisticService;
import edu.escuelaing.arem.ASE.app.utils.JsonUtil;
import edu.escuelaing.arem.ASE.app.utils.LinkedList;
import edu.escuelaing.arem.ASE.app.utils.List;
import spark.Spark;

import java.lang.reflect.Type;


public class StatisticController {

    private Type typeOfListOfFloat = new TypeToken<LinkedList<Float>>() {}.getType();
    private final StatisticService statisticService;

    public StatisticController(StatisticService statisticService) {
        this.statisticService = statisticService;

        Spark.post(Router.STATISTIC_CALCULATOR, (request, response) -> {
            List<Float> data = JsonUtil.fromJson(request.body(), typeOfListOfFloat);
            response.type("application/json");
            return this.statisticService.calculateMeanAndStandardDeviation(data);
        }, JsonUtil.json());

        Spark.post(Router.MEAN, (request, response) -> {
            List<Float> data = JsonUtil.fromJson(request.body(), typeOfListOfFloat);
            response.type("application/json");
            return this.statisticService.calculateMean(data);
        }, JsonUtil.json());

        Spark.post(Router.STANDARD_DEVIATION, (request, response) -> {
            List<Float> data = JsonUtil.fromJson(request.body(), typeOfListOfFloat);
            response.type("application/json");
            return this.statisticService.calculateStandardDeviation(data);
        }, JsonUtil.json());

    }
}
