package factoryPattern.demo2;

import factoryPattern.demo2.pizzas.*;

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
