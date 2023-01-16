package ch01.practice;

public class NoFlyStrategy implements FlyActionStrategy {
    @Override
    public void fly() {
        System.out.println("난 못 날아요.");
    }

    public static NoFlyStrategy of() {
        return new NoFlyStrategy();
    }
}
