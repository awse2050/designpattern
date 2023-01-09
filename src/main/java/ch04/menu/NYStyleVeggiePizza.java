package ch04.menu;

import ch04.menu.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "VeggiePizz";
        dough = "VeggiePizz dough";
        sauce = "VeggiePizz 소스";

        toppings.add("잘게 썬 VeggiePizz 치즈");
    }
}
