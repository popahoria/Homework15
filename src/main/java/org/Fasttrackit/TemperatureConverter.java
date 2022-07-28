package org.Fasttrackit;

public class TemperatureConverter {

    public static Double fahrenheitToCelsius(Double temperature) {
        if(temperature == null){
            return null;
        }else{
            temperature = (temperature-32) * 5.0 / 9;
        }
        return temperature;
    }

    public static Double celsiusToFahrenheit(Double temperature){
        if(temperature ==null){
            return null;
        }else {
            temperature = temperature * 9/5 + 32;
        }
        return temperature;
    }
}
