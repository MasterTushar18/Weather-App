package com.tushar.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private Request request;
    private Location location;
    private Current current;

    @Data
    public static class Request {
        private String type;
        private String query;
        private String language;
        private String unit;
    }

    @Data
    public static class Location {
        private String name;
        private String country;
        private String region;
        private String lat;
        private String lon;
        private String timezone_id;
        private String localtime;
        private long localtime_epoch;
        private String utc_offset;
    }

    @Data
    public static class Current {
        private String observation_time;
        private int temperature;
        private int weather_code;
        private List<String> weather_icons;
        private List<String> weather_descriptions;
        private int wind_speed;
        private int wind_degree;
        private String wind_dir;
        private int pressure;
        private int precip;
        private int humidity;
        private int cloudcover;
        private int feelslike;
        private int uv_index;
        private int visibility;
        private Map<String, Object> astro;
        private Map<String, Object> air_quality;
    }
}