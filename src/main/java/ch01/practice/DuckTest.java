package ch01.practice;

public class DuckTest {

    public static void main(String[] args) {

        /**
         * 날거나, 소리지르거나, 걷는 기능이 없는 오리를 생성.
         */
        Duck duck = new MallaDuck();

        duck.fly();
        duck.quack();
        duck.walk();
        duck.display();

        /**
         * 특정한 설정에 의해서 기능들이 추가되었다.
         */
        duck = new MallaDuck(FlyableStrategy.of(),
                QuackableStrategy.of(),
                WalkableStrategy.of());

        duck.fly();
        duck.quack();
        duck.walk();
        duck.display();
    }

}
