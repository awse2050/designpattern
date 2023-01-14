package ch01.practice;

import ch01.strategy.asis.behavior.Quackable;

public class QuackableStrategy implements QuackActionStrategy {

    @Override
    public void quack() {
        System.out.println("꽥꽥꽥");
    }

    public static QuackableStrategy of() {
        return new QuackableStrategy();
    }
}
