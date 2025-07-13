package com.tushar.weather.service;
import com.tushar.weather.model.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${weatherstack.api.key}")
    private String apiKey;
    private final RestTemplate restTemplate = new RestTemplate();
    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);


    public WeatherResponse getWeather(String city) {
        log.info("Inside class WeatherService in getWeather(). Fetching weather for city: {}", city);
        String url = "http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city;
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}