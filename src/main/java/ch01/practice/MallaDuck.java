package ch01.practice;

public class MallaDuck extends Duck {

    public MallaDuck() {
        setFlyActionStrategy(NoFlyStrategy.of());
        setQuackActionStrategy(NoQuackStrategy.of());
        setWalkActionStrategy(NoWalkStrategy.of());
    }

    public MallaDuck(FlyActionStrategy flyActionStrategy,
                     QuackActionStrategy quackActionStrategy,
                     WalkActionStrategy walkActionStrategy) {
        setFlyActionStrategy(flyActionStrategy);
        setQuackActionStrategy(quackActionStrategy);
        setWalkActionStrategy(walkActionStrategy);
    }

    @Override
    public void display() {
        System.out.println("this is MallaDuck");
    }
}
