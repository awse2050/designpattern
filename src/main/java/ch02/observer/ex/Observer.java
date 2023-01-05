package ch02.observer.ex;

/**
 * Subject -> Observer
 * 각 주제마다 여러개의 옵저버가 있을 수 있다.
 *
 * 옵저버가 될 가능성이 있는 객체는 해당 인터페이스를 구현해야 한다.
 * 이 인터페이스는 주제의 상태가 변경되었을 때 호출되는 메서드 뿐이다.
 */
public interface Observer {

    // push 방식
//    void update(float temp, float humidity, float pressure);
    // pull 방식
    void update();

}
