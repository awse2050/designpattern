package ch01.strategy.tobe;

import ch01.strategy.tobe.behavior.*;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.setQuackBehavior(new Quack());
        super.setFlyBehavior(new FlyNoWay());
    }

    /**
     *  이 방식은 특정 구현체에 의존하게 된다.
     *  따라서 조금 더 유연하게 바꿀 수 있다.
     */
    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super.setQuackBehavior(quackBehavior);
        super.setFlyBehavior(flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }

}
