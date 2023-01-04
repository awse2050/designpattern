package ch01.strategy.tobe.behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("난다 날아!");
    }
}
