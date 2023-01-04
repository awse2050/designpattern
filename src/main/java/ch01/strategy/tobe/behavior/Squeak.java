package ch01.strategy.tobe.behavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("고무오리 꽥");
    }
}
