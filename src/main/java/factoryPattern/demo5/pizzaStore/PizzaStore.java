package factoryPattern.demo5.pizzaStore;

import factoryPattern.demo5.factory.IngredientFactory;
import factoryPattern.demo5.pizzas.Pizza;

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


    public abstract Pizza createPizza(String type);

}
