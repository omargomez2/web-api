package com.omarg2.dto;

public class TemperatureResponse {

    private double celsius;
    private double fahrenheit;
    private String status;

    public TemperatureResponse() {
    }

    public TemperatureResponse(
            double celsius,
            double fahrenheit,
            String status) {

        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.status = status;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}