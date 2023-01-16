package ch08;

/** 추상화 클래스를 만든다. */
public abstract class CaffeineBeverage {

    /** 해당 메서드는 아무나 오버라이딩 하지 못하도록 final을 붙인다. */
    /** 해당 메서드는 템플릿 역할을 한다. 특정한 음료를 만드는 알고리즘의 템플릿. */
    final void prepareRecipe() {
        /**
         * 각 단계별로 알고리즘이 표현되어 있고
         * 그 중에서 서브 클래스에서 구현된 알고리즘이 포함되어 있다.
         */
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /** 커피와 홍차가 서로 다른 구현방식을 가지고 있기 떄문에
     * 두 메서드는 다르게 설정해야 하므로 추상메서드로 선언한다.
     */
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

}
