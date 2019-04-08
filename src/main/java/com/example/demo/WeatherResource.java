package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherResource {
    private static final Logger LOG = LoggerFactory.getLogger(WeatherResource.class);
    private Weather[] weathers = {
            new Weather("Sunny", -10),
            new Weather("Sunny", -5),
            new Weather("Sunny", 0),
            new Weather("Cloudy", 2),
            new Weather("Cloudy", 5),
            new Weather("Cloudy", -2),
            new Weather("Overcast", 4),
    };

    @GetMapping
    public ResponseEntity<Weather> currentWeather() {
        LOG.info("Checking weather...");
        if (Math.random() < 0.1) {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
        }
        return ResponseEntity.ok(weathers[LocalTime.now().getMinute() % weathers.length]);
    }
}
