package org.Fasttrackit;
/**
 * Rezolvati problema intr-un proiect maven(puteti sa-l folositi pe cel de la curs) folosind Test Driven Development(TDD), adica vei crea testul inainte sa scrii codul algoritmului.
 * Scrieti intr-o clasa 2 metode, una care primeste o temperatura in grade Fahrenheit si returneaza temperatura respectiva convertita in grade Celsius, si cealalta celsius in fahrenheit
 * Formula de conversie este: T(°C) = (T(°F) - 32) × 5/9
 * Formula de conversie este: T(°F) = T(°C) x 9/5 + 32

 * Semnatura metodei este:
 * public static double fahrenheitToCelsius(double temperature)
 * public static double celsiusToFahrenheit(double temperature)

 * Exemplu:
 * fahrenheitToCelsius(100) -> 37.777777778
 * fahrenheitToCelsius(0) -> -17.777777778
 * fahrenheitToCelsius(50) -> 10
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTemperatureConverter {

    @Test
    public void instantiateClass(){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void callMethodFahrenheitToCelsius(){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.fahrenheitToCelsius(100.0);
    }
    @Test
    public void methodReturnDouble(){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Double temperature = 100.0;
        Double result = TemperatureConverter.fahrenheitToCelsius(temperature);
    }

    @Test
    public void returnNullIfTempNull() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Double temperature = null;
        Double result = TemperatureConverter.fahrenheitToCelsius(temperature);
        Assertions.assertThat(result).isEqualTo(null);

    }

    @Test
    public void returnFahrenheit(){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Double temperature = 37.77777777777778;
        Double result = TemperatureConverter.celsiusToFahrenheit(temperature);
        Assertions.assertThat(result).isEqualTo(100.0);
    }

    @Test
    public void celsiusToFahrenheitReturnDouble(){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Double temperature = 10.0;
        Double result = TemperatureConverter.celsiusToFahrenheit(temperature);
    }

    @Test
    public void celsiusToFahrenheitReturnNull(){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Double temperature = null;
        Double result = TemperatureConverter.celsiusToFahrenheit(null);
        Assertions.assertThat(temperature).isEqualTo(null);
    }

    @Test
    public void returnCelsius(){
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Double temperature = 10.0;
        Double result = TemperatureConverter.celsiusToFahrenheit(temperature);
        Assertions.assertThat(result).isEqualTo(50);
    }


}
