package ch02.observer.ex;


/**
 * 주제 역할을 하는 구상클래스로 항상 Subject를 구현해야 한다.
 * 주제 클래스는 등록 및 해제 메소드와 상태가 바뀔떄마다
 * 모든 옵저버에게 연락하는 메서드를 구현해야 한다.
 */
public class ConcreteSubject implements  Subject {

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }

    /**
     * 상태를 알아내고 설정하는 메서드가 있을 수 있다.
     */
    void getState() {

    }

    void setState() {

    }


}
