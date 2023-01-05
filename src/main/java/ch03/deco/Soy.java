package ch03.deco;

import ch03.decorate.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public Soy(Beverage beverage, Size size) {
        this.beverage = beverage;
        setSize(size);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "두유";
    }

    /**
     * 음료의 가격에 데코레이팅한 두유의 가격을 합친다.
     * @return
     */
    @Override
    public double cost() {

        double v = beverage.cost() + .50;

        if(beverage.getSize() == Size.TALL) {
            v += .10;
        } else if(beverage.getSize() == Size.GRANDE) {
            v += .20;
        } else if (beverage.getSize() == Size.VENTI) {
            v += .30;
        }

        return v;
    }
}