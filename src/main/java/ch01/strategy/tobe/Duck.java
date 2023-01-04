package ch01.strategy.tobe;

import ch01.strategy.tobe.behavior.FlyBehavior;
import ch01.strategy.tobe.behavior.QuackBehavior;

/**
 * 인터페이스를 설계해서 원하는 방향으로 변경하자.
 */
public abstract class Duck {

    /**
     * 각 행동들은 인터페이스화 시키고 각 특정클래스를 만들어 해당 행동을 구현시킨다.
     * 구현한 클래스를 갈아끼워서 사용한다.
     * 직접 처리하지 않고 구현체(객체)에게 위임한다.
     */
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("수영한다.");
    }

    public abstract void display();

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
