package chapter4.demo3;

import chapter4.demo3.pizzas.Pizza;

public class PizzaStore {

    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.pizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = this.pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
