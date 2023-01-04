package ch01.strategy.tobe.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날수없다.");
    }
}
