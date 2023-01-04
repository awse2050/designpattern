package ch01.strategy.tobe;

import ch01.strategy.asis.behavior.Quackable;
import ch01.strategy.tobe.behavior.FlyBehavior;
import ch01.strategy.tobe.behavior.QuackBehavior;

public class RubberDuck extends Duck  {

    public RubberDuck() {
    }

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super.setQuackBehavior(quackBehavior);
        super.setFlyBehavior(flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
