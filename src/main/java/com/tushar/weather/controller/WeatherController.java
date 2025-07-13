package com.tushar.weather.controller;

import com.tushar.weather.model.WeatherResponse;
import com.tushar.weather.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {

    private final WeatherService weatherService;
    private static final Logger log = LoggerFactory.getLogger(WeatherController.class);

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/api/weather")
    @ResponseBody
    public WeatherResponse getWeather(@RequestParam String city) {

        log.info("Inside class Controller in getWeather().");
        WeatherResponse weatherResponse = weatherService.getWeather(city);
        log.info("Weather data fetched successfully for city: {}", weatherResponse.toString());

        return weatherResponse;
    }
}