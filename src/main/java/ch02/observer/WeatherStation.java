package ch02.observer;

import ch02.observer.impl.CurrentConditionDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 54, 30.4f);

    }
}
