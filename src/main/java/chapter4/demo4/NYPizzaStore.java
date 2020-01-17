package chapter4.demo4;

import chapter4.demo4.pizzas.NYStyleCheesePizza;
import chapter4.demo4.pizzas.NYStyleClamPizza;
import chapter4.demo4.pizzas.NYStyleVeggiePizza;
import chapter4.demo4.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)) {       // 奶酪
            return new NYStyleCheesePizza();
        }
        else if ("clam".equals(type)) {   // 蛤蜊
            return new NYStyleClamPizza();
        }
        else if ("veggie".equals(type)) {  // 蔬菜
            return new NYStyleVeggiePizza();
        }
        else {
            throw new RuntimeException("unknown new york style pizza type [ " + type + " ]");
        }
    }
}
