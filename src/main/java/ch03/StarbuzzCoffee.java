package ch03;

import ch03.deco.Mocha;
import ch03.deco.Soy;
import ch03.deco.Whip;
import ch03.decorate.Beverage;
import ch03.decorate.DarkRoast;
import ch03.decorate.Espresso;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(
                "beverage = " + beverage.getDescription()
                        + " $" + beverage.cost()
        );

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);

        System.out.println(
                "beverage = " + beverage2.getDescription()
                        + " $" + beverage2.cost()
        );


    }

}
