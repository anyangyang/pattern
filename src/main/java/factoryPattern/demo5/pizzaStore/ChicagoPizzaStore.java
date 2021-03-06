package factoryPattern.demo5.pizzaStore;

import factoryPattern.demo5.factory.ChicagoIngredientFactory;
import factoryPattern.demo5.pizzas.ChicagoStyleClamPizza;
import factoryPattern.demo5.pizzas.ChicagoStylePepperoniPizza;
import factoryPattern.demo5.pizzas.ChicagoStyleVeggiePizza;
import factoryPattern.demo5.pizzas.ChicagoStyleCheesePizza;
import factoryPattern.demo5.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
        this.ingredientFactory = new ChicagoIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        if("cheese".equals(type)) {       // 奶酪
            return new ChicagoStyleCheesePizza(ingredientFactory);
        }
        else if ("clam".equals(type)) {   // 蛤蜊
            return new ChicagoStyleClamPizza(ingredientFactory);
        }
        else if ("veggie".equals(type)) {  // 蔬菜
            return new ChicagoStyleVeggiePizza(ingredientFactory);
        }
        else if ("pepperoni".equals(type)) {   // 意大利辣味香肠
            return new ChicagoStylePepperoniPizza(ingredientFactory);
        }
        else {
            throw new RuntimeException("unknown Chicago style pizza type [ " + type + " ]");
        }

    }
}
