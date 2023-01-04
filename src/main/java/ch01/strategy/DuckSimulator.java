package ch01.strategy;

import ch01.strategy.tobe.Duck;
import ch01.strategy.tobe.MallardDuck;

public class DuckSimulator {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();

        duck.performFly();
        duck.performQuack();

    }
}
