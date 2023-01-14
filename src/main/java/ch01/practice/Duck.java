package ch01.practice;

public abstract class Duck {

    private QuackActionStrategy quackActionStrategy;
    private FlyActionStrategy flyActionStrategy;

    /**
     * 만약 오리들이 걸을수 있다 라고한다면??
     */
    private WalkActionStrategy walkActionStrategy;

    public abstract void display();

    public void quack() {
        quackActionStrategy.quack();
    }

    public void fly() {
        flyActionStrategy.fly();
    }

    public void walk() {
        walkActionStrategy.walk();
    }

    /**
     * 걷는 기능이 추가되서 오리객체들에게 걷는 기능을 부여했다.
     * @param walkActionStrategy
     */
    public void setWalkActionStrategy(WalkActionStrategy walkActionStrategy) {
        this.walkActionStrategy = walkActionStrategy;
    }

    public void setQuackActionStrategy(QuackActionStrategy quackActionStrategy) {
        this.quackActionStrategy = quackActionStrategy;
    }

    public void setFlyActionStrategy(FlyActionStrategy flyActionStrategy) {
        this.flyActionStrategy = flyActionStrategy;
    }

    /**
     *  각각 오리들의 특징을 만들어줘야 한다.
     *  하지만 해당 Duck클래스를 구현한 서브클래스들은
     *  각 Duck의 특징과 상관없이 해당 기능들을 구현받고 사용할수있게된다.
     *  만약 두 기능중 하나의 기능을 쓸 수 없는 Duck을 구현해야 한다면?
     *  상속의 단점이 생겨나버린다.
     */
//    public void quack() {
//        System.out.println("꽥꽥");
//    }
//
//    public void fly() {
//        System.out.println("오리는 날 수 있다.");
//    }
}
