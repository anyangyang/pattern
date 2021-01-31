package factoryPattern.demo3;

import factoryPattern.demo3.pizzas.*;

public abstract class SimplePizzaFactory {

    abstract Pizza createPizza(String type);

}
