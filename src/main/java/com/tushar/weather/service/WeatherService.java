package com.tushar.weather.service;

import com.tushar.weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${weatherstack.api.key}") // Injects value from application.properties
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherResponse getWeather(String city) {
        String url = "http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city;
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}