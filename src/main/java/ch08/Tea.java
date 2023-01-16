package ch08;

/** 홍차를 우려내는 클래스 */
public class Tea extends CaffeineBeverage {

    // AS-IS
//    void prepareRecipe() {
//        boilWater();
//        steepTeaBag();
//        pourInCup();
//        addLemon();
//    }
//
//    public void steepTeaBag() {
//        System.out.println("찻잎 우려내는 중");
//    }
//
//    public void addLemon() {
//        System.out.println("레몬을 추가하는 중");
//    }
//
//    /** 중복된 부분이 발견되었다. */
//    public void boilWater() {
//        System.out.println("물 끓이는 중");
//    }
//
//    public void pourInCup() {
//        System.out.println("컵에 따르는 중");
//    }

    /** 각 구현알고리즘을 해당 클래스에서 구현한다. */
    @Override
    void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
