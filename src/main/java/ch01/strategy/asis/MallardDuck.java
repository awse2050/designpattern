package ch01.strategy.asis;

import ch01.strategy.asis.behavior.Flyable;
import ch01.strategy.asis.behavior.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }


    @Override
    public void fly() {
        System.out.println("말라덕은 날수있다.");
    }

    @Override
    public void quack() {
        System.out.println("말라덕은 소리친다.");
    }
}
