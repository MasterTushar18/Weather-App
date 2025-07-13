package com.tushar.weather.controller;

import com.tushar.weather.model.WeatherResponse;
import com.tushar.weather.service.WeatherService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;

class WeatherControllerTest {


    @Test
    void testGetWeather() {
        WeatherService weatherService = org.mockito.Mockito.mock(WeatherService.class);
        WeatherController controller = new WeatherController(weatherService);
        when(weatherService.getWeather("London")).thenReturn(new WeatherResponse());
        controller.getWeather("London");
    }
}