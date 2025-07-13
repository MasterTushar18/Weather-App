package com.tushar.weather.controller;

import com.tushar.weather.model.WeatherResponse;
import com.tushar.weather.service.WeatherService;
import com.tushar.weather.model.WeatherResponse;
import com.tushar.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

//    @GetMapping("/")
//    public String home() {
//        return "redirect:/index.html";
//    }

    @GetMapping("/api/weather")
    @ResponseBody
    public WeatherResponse getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }
}