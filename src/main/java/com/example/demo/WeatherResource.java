package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherResource {
    private static final Logger LOG = LoggerFactory.getLogger(WeatherResource.class);

    @GetMapping
    public Map<String, String> currentWeather() {
        LOG.info("Checking weather...");
        return Collections.singletonMap("forecast", "Cloudy with a chance of meatballs");
    }
}
