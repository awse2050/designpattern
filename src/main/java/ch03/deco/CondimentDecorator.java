package ch03.deco;

import ch03.decorate.Beverage;

public abstract class CondimentDecorator extends Beverage {
    /**
     * 각 데코레이터가 감쌀 음료를 나타내는 객체를 여기에 저장한다.
     * 어떤음료든 감쌀 수 있도록 슈퍼클래스를 사용한다.
     */
    Beverage beverage;

    /**
     * 모든 첨가를 데코레이터에 이 메서드를 구현하도록 할 예정이다.
     * @return
     */
    public abstract String getDescription();

    /**
     * 데코레이터에 음료 사이즈를 리턴하는 메서드를 추가
     * @return
     */
    public Size getSize() {
        return beverage.getSize();
    }
}
