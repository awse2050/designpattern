package ch04;

import ch04.store.NYPizzaStore;
import ch04.store.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("cheese");
    }
}
