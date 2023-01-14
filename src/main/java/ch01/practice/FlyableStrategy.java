package ch01.practice;

public class FlyableStrategy implements FlyActionStrategy{
    @Override
    public void fly() {
        System.out.println("날 수 있습니다.");
    }

    public static FlyableStrategy of() {
        return new FlyableStrategy();
    }
}
