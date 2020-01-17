package chapter4.demo1;

import chapter4.demo1.pizzas.*;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)) {       // 奶酪
            pizza = new CheesePizza();
        }
        else if ("clam".equals(type)) {   // 蛤蜊
            pizza = new ClamPizza();
        }
        else if ("veggie".equals(type)) {  // 蔬菜
            pizza = new VeggiePizza();
        }
        else if ("pepperoni".equals(type)) {   // 意大利辣味香肠
            pizza = new PepperoniPizza();
        }
        else {
            throw new RuntimeException("unknown pizza type [ " + type + " ]");
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
