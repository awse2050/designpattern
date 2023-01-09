package ch04;

import ch04.menu.Pizza;

public abstract class PizzaStore {


    /**
     * 피자 객체 를 만드는 행위는 PizzaStore의 구현 클래스에서
     * 만들어서 처리를 하게 되었다.
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 각 팩토리 내에 있는 createPizza를 불러온다.
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);

}
