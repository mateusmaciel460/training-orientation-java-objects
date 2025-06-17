package br.com.mateusmaciel460.challenges.CommonBehaviors;

interface TemperatureConverter {
    double celsiusToFahrenheit(double temperature);
    double fahrenheitToCelsius(double temperature);
}

public class StandardTemperatureConverter implements TemperatureConverter {
    @Override
    public double celsiusToFahrenheit(double temperature) {
        return temperature * (9.0 / 5.0) + 32;
    }

    public double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) / 1.8;
    }

    public void showConversionTemperatureOnScreen(double celsius, double fahrenheit) {
        System.out.println(
                String.format("%.0f celsius em fahrenheit é %.2f", celsius, celsiusToFahrenheit(celsius))
        );

        System.out.println(
                String.format("%.2f fahrenheit em celsius é %.0f", fahrenheit, fahrenheitToCelsius(fahrenheit))
        );
    }
}
