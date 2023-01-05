package ch02.observer.ex;

/**
 * Observer 인터페이스를 구현한다면
 * 무엇이든 옵저버 클래스가 될 수 있다.
 *
 * 각 옵저버는 특정 주제에 등록해서 연락받을 수 있다.
 */
public class ConcreteObserver implements Observer {

    // push 방식
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//
//    }

    //  pull 방식
    @Override
    public void update() {

    }
}
