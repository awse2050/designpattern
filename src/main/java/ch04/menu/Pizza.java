package ch04.menu;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();


    public void prepare() {
        System.out.println("prepare.. : " +name);
        System.out.println("도우 돌리기");
        System.out.println("소스 뿌리기");
        System.out.println("토핑 올리기");
        for (String topping : toppings) {
            System.out.println(" "+topping);
        }
    }

    public void bake() {
        System.out.println("굽기");
    }

    public void cut() {
        System.out.println("사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 담기");
    }

    public String getName() {
        return this.name;
    }
}
