package ch01.strategy.tobe;

import ch01.strategy.tobe.behavior.FlyBehavior;
import ch01.strategy.tobe.behavior.QuackBehavior;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
    }

    public DecoyDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super.setQuackBehavior(quackBehavior);
        super.setFlyBehavior(flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }
}
