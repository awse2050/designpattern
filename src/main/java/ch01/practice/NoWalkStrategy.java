package ch01.practice;

public class NoWalkStrategy implements WalkActionStrategy {
    @Override
    public void walk() {
        System.out.println("난 걸을 수 없습니다...");
    }

    public static NoWalkStrategy of(){
        return new NoWalkStrategy();
    }
}
