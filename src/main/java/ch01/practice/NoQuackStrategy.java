package ch01.practice;

public class NoQuackStrategy implements QuackActionStrategy {
    @Override
    public void quack() {
        System.out.println("난 소리 못질러요.");
    }

    public static NoQuackStrategy of() {
        return new NoQuackStrategy();
    }
}
