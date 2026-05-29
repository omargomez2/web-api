package com.omarg2.remote;


import jakarta.ejb.Remote;

@Remote
public interface TemperatureRemote {

    double celsiusToFahrenheit(double celsius);
}