package ch08;


public class Coffee extends CaffeineBeverage {

    // AS-IS
//    /** 커피를 만드는 방법 */
//    void prepareRecipe() {
//        boilWater();
//        brewCoffeeGrinds();
//        pourInCup();
//        addSugarandMilk();
//    }
//
//    /** 각 메서드마다 알고리즘을 구현하고 있다. */
//    public void boilWater() {
//        System.out.println("물 끓이는 중");
//    }
//
//    public void brewCoffeeGrinds() {
//        System.out.println("필터로 커피 우려내는 중");
//    }
//
//    public void pourInCup() {
//        System.out.println("컵에 따르는 중");
//    }
//
//    public void addSugarandMilk() {
//        System.out.println("설탕과 우유를 추가하는 중");
//    }

    // TO-BE
    /**  각 클래스에서 구현될 알고리즘을 정의하면 된다. */
    @Override
    void brew() {
        System.out.println("필터로 커피 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유 첨가하는 중");
    }
}
