package ch03.deco;

import ch03.decorate.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "두유";
    }

    /**
     * 음료의 가격에 데코레이팅한 휘핑의 가격을 합친다.
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + .50;
    }
}