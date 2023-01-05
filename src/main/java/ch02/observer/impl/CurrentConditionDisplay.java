package ch02.observer.impl;

import ch02.observer.WeatherData;
import ch02.observer.ex.DisplayElement;
import ch02.observer.ex.Observer;

/**
 * WeatherData로 부터 변경사항을 받으려면 Observer를 구현해야한다.
 * API 구조상 모든 디스플레이 항목에서 DisplayElement를 구현해야 한다
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        // 자신을 등록시켜서 구독시킨다.
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                "현재 상태 : 온도 "+temperature + "F, 습도 " + humidity + "%"
        );
    }

    /**
     * 호출시 온도와 습도를 저장하고 display를 호출한다.
     */
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
