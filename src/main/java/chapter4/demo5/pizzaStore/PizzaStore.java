package chapter4.demo5.pizzaStore;

import chapter4.demo5.factory.IngredientFactory;
import chapter4.demo5.pizzas.Pizza;

public abstract class PizzaStore {

    protected IngredientFactory ingredientFactory;

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


    abstract Pizza createPizza(String type);

}
