package ch04.store;

import ch04.menu.Pizza;
import ch04.menu.ny.NYStyleCheesePizza;
import ch04.menu.ny.NYStyleClamPizza;
import ch04.menu.ny.NYStylePepperoniPizza;
import ch04.menu.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
