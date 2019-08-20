package edu.escuelaing.arem.ASE.app.utils;


import com.google.gson.Gson;
import spark.ResponseTransformer;

import java.lang.reflect.Type;

public class JsonUtil {
    private static final Gson gson = new Gson();

    private static String toJson(Object object) {
        return gson.toJson(object);
    }

    public static <T> T fromJson(String json, Type type){
        return gson.fromJson(json, type);
    }

    public static ResponseTransformer json() {
        return JsonUtil::toJson;
    }
}