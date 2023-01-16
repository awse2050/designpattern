package ch01.practice;

public class WalkableStrategy implements WalkActionStrategy {
    @Override
    public void walk() {
        System.out.println("걸을 수 있습니다.");
    }

    public static WalkableStrategy of() {
        return new WalkableStrategy();
    }

}
