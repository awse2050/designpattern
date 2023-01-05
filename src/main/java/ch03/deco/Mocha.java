package ch03.deco;

import ch03.decorate.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "모카";
    }

    /**
     * 음료의 가격에 데코레이팅한 모카의 가격을 합친다.
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
