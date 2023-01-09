package ch04.ingredient;

/**
 * 각각의 원재료들을 생성한다.
 * 지역마다 달라지는 부분을 처리 한다.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
