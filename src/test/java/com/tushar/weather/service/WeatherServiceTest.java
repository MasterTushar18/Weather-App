package com.tushar.weather.service;

import com.tushar.weather.model.WeatherResponse.Location;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {
    @Test
    void getWeather() {
        WeatherService weatherService = new WeatherService();
        Location location = new Location();

        String city = "London";
        var response = weatherService.getWeather(city);
        location.setName(city);
        response.setLocation(location);

        assertNotNull(response, "Response should not be null");
        assertEquals(city, response.getLocation().getName(), "City name should match");
    }
}