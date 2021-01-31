package factoryPattern.demo4;

import factoryPattern.demo4.pizzas.ChicagoStyleCheesePizza;
import factoryPattern.demo4.pizzas.ChicagoStyleClamPizza;
import factoryPattern.demo4.pizzas.ChicagoStylePepperoniPizza;
import factoryPattern.demo4.pizzas.ChicagoStyleVeggiePizza;
import factoryPattern.demo4.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type)) {       // 奶酪
            return new ChicagoStyleCheesePizza();
        }
        else if ("clam".equals(type)) {   // 蛤蜊
            return new ChicagoStyleClamPizza();
        }
        else if ("veggie".equals(type)) {  // 蔬菜
            return new ChicagoStyleVeggiePizza();
        }
        else if ("pepperoni".equals(type)) {   // 意大利辣味香肠
            return new ChicagoStylePepperoniPizza();
        }
        else {
            throw new RuntimeException("unknown Chicago style pizza type [ " + type + " ]");
        }
    }
}
