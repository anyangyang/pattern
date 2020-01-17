package chapter4.demo2;

import chapter4.demo2.pizzas.*;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
