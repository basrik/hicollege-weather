package com.example.demo;

public class Weather {

    private String forecast;
    private int temperature;

    public Weather(String forecast, int temperature) {
        this.forecast = forecast;
        this.temperature = temperature;
    }

    public Weather() {
        // For JSON
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
