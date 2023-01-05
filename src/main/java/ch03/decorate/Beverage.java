package ch03.decorate;

/**
 * 음료를 나타내는 추상 클래스이다.
 * 매장에서 판매되는 음료는 모두 이 클래스의 서브클래스가 된다.
 */
public abstract class Beverage {

    /**
     * 사이즈별로 가격을 나누기로 하였다.
     */

    public enum Size { TALL, GRANDE, VENTI };

    Size size = Size.TALL;

    String description = "제목 없음";

    public String getDescription() {
        return this.description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }


    public abstract double cost();

}
