package ch02.observer;

import ch02.observer.ex.Observer;
import ch02.observer.ex.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {


    private List<Observer> observers; // 옵저버 객체를 저장해둔다.
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public WeatherData(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            // push 방식
//            observer.update(temperature, humidity, pressure);
            // pull 방식
            observer.update();
        }
    }

    /**
     * 가장 최근에 측정도니 온도, 습도, 기압을
     * 보여주는 역할을 맡고 있는 클래스가 있다.
     *
     * 기상 데이터 요소 3개를 구현해야하고
     * 새로운 측정값이 들어올떄마다 디스플레이를 갱신해야하는데
     * measurementsChanged를 사용해서 업데이트 한다.
     */

    // 가장 최근 변경된 데이터로 변경하는 기능이다.
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getPressure() {
        return this.pressure;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getTemperature() {
        return this.temperature;
    }
}
