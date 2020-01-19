package chapter4.demo2;

import chapter4.demo2.pizzas.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if("cheese".equals(type)) {       // 奶酪
            return new CheesePizza();
        }
        else if ("clam".equals(type)) {   // 蛤蜊
            return new ClamPizza();
        }
        else if ("veggie".equals(type)) {  // 蔬菜
            return new VeggiePizza();
        }
        else if ("pepperoni".equals(type)) {   // 意大利辣味香肠
            return new PepperoniPizza();
        }
        else {
            throw new RuntimeException("unknown pizza type [ " + type + " ]");
        }
    }

}
