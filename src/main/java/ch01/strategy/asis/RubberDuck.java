package ch01.strategy.asis;

import ch01.strategy.asis.behavior.Quackable;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("러버덕은 소리친다.");
    }
}