package ch01.strategy.tobe.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}
