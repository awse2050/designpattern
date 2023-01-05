package ch02.observer.ex;

/**
 * 주제를 나타낸다.
 * 객체에서 옵저버를 등록하거나 옵저버 목록에서
 * 탈퇴하고 싶을때는 이 인터페이스를 사용한다.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
