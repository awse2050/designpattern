package ch04.store;

import ch04.menu.Pizza;

/**
 * 추상 생산자 클래스
 * 나중에 서브클래스에서 객체를 생성하려고 구현하는
 * 팩토리 메서드를 정리한다.
 *
 * 생산자 클래스에 추상 제품 클래스에 의존하는 코드가 들어올수있다.
 * 이 제품의 클래스 객체는 클래스의 서브 클래스에 의해 만들어진다.
 *
 * 각 Store(NYPizzaStore) 에서 팩토리 메서드를 구현하고
 * 제품을 생성해 낸다. 이떄 특정 타입에 따라서 만들어내는 피자가 달라진다.
 */
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
