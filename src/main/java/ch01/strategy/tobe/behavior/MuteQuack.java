package ch01.strategy.tobe.behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("소리낼수없다 꽥...");
    }
}
