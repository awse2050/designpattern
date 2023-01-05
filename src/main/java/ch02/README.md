### 기상 모니터링 애플리케이션

```java
public class WeatherData {

    /**
     * 가장 최근에 측정도니 온도, 습도, 기압을
     * 보여주는 역할을 맡고 있는 클래스가 있다.
     *
     * 기상 데이터 요소 3개를 구현해야하고
     * 새로운 측정값이 들어올떄마다 디스플레이를 갱신해야하는데
     * measurementsChanged를 사용해서 업데이트 한다.
     */

    public void measurementsChanged() {
        // 가장 최근 변경된 데이터로 변경하는 기능이다.

        float temp = getTemperature();
        float humidity = gethumidity();
        float pressure = getPressure();

        // 각 디스플레이를 갱신한다.
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    private float getPressure() {
        return 0;
    }

    private float gethumidity() {
        return 0;
    }

    private float getTemperature() {
        return 0;
    }
}
```

#### 문제점

- 인터페이스가 아닌 구체적인 구현을 바탕으로 되어있다.
- 새로운 디스플레이 항목이 추가되면 코드를 변경해야한다.
- 실행 중 디스플레이 항목을 추가&제거 불가능
- 디스플레이 항목들이 공통적인 인터페이스를 구현하지 않음.


### 옵저버 패턴

1. 신문사가 사업을 시작하고 신문을 찍는다.
2. 독자가 특정 신문사에 구독신청을 하면 매번 새로운 신문이 나올 때 마다 배달을 받을 수 있따.
3. 더이상 신문을 보고싶지 않을 경우 구독 해지신청을 한다. 그러면 더이상 신문이 오지 않는다.

**신문사 + 구독자** 로 볼 수 있다.

신문 구독 메커니즘을 이해한다면 `옵저버 패턴` 을 쉽게 이해할 수 있다.

신문사를 `주제(subject)`, 구독자를 `옵저버(observer)` 라고 부른다.

- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 각 자동으로 내용이 갱신되는 방식으로
일대다 의존성을 정의한다.


### 느슨한 결합의 위력

`느슨한 결합`은 객체들이 상호작용할 수 있지만 서로 잘모르는 관계를 의미한다.

`느슨한 결합`은 활용하면 유연성이 좋아진다.

- 주제는 옵저버가 특정 인터페이스를 구현한다는 것 만 알고 무엇을 하는지 알 필요가 없다.
- 새로운 형식의 옵저버가 추가되어도 인터페이스를 구현하기만 하고 등록하면 되기 때문에 주제는 신경 쓸 필요가 없다.
- 서로 느슨한 결합이기 때문에 어느 한쪽을 고쳐도 서로 영향을 받지 않는다.


### 푸시와 풀

`주제`가 `옵저버`로 부터 데이터를 보내는 **푸시**를 사용하거나 
`옵저버`가 `주제`로부터 데이터를 당겨오는 **풀**을 사용하는 방법이 있다.
둘 중 하나를 선택하는 것은 구현방법의 문제이다.

**대체로 `옵저버`가 필요한 데이터를 골라서 가져가도록 하는 방법이 더 좋긴하다.**

### 풀 방식으로 코드를 변경해본다.


#### AS-IS

```java

@Override
public void notifyObserver() {
    for(Observer observer : observers) {
        observer.update(temperature, humidity, pressure);
    }
}

public interface Observer {
    void update(float temp, float humidity, float pressure);
}

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
    
}
```

#### TO-BE

```java
// 옵저버의 update()를 인자없이 호출한다.
@Override
public void notifyObserver() {
        for(Observer observer : observers) {
        observer.update(temperature, humidity, pressure);
        }
}
// 인터페이스에서 매개변수가 없도록 변경한다.
public interface Observer {
    void update();
}

// WeatherData 의 Getter 메서드를 통해서 주제의 날씨를 가져오도록
// 각 Observer 구상 클래스를 수정한다.
public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
}

```