package ch01.strategy.asis;

/**
 * 행동을 상속할 때 단점.
 * 1. 서브클래스에서 코드가 중복된다.
 * 2. 실행시 특징을 바꾸기 어렵다
 * 3. 모든 오리의 행동을 알기 힘들다.
 * 4. 코드 변경시 다른 오리에 영향을 미칠 수 있다.
 */
public abstract class Duck {
    /**
     * 모든 오리는 소리를 지르고
     * 헤엄을 칠 수 있다.
     */
    public void quack() {
        System.out.println("꽥!");
    }

    public void swim() {
        System.out.println("헤엄치기!");
    }

    /**
     * 모든 오리의 모양이 다르므로 추상메서드로 선언한다.
     * 오리마다 별도로 메서드를 구현한다.
     */
    public abstract void display();

    /**
     * 오리들이 날 수 있도록 하자.
     * 하지만 동물이 아닌 고무오리의 경우 날 수 없는데,
     * 날 수 있는 기능이 생겼다.
     * 따라서 오류가 발생한다.
     */
    public void fly() {
        System.out.println("난다 날아!");
    }
}
