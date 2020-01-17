package chapter4.demo5.pizzaStore;

import chapter4.demo5.factory.ChicagoIngredientFactory;
import chapter4.demo5.factory.IngredientFactory;
import chapter4.demo5.pizzas.ChicagoStyleClamPizza;
import chapter4.demo5.pizzas.ChicagoStylePepperoniPizza;
import chapter4.demo5.pizzas.ChicagoStyleVeggiePizza;
import chapter4.demo5.pizzas.ChicagoStyleCheesePizza;
import chapter4.demo5.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
        this.ingredientFactory = new ChicagoIngredientFactory();
    }

    @Override
    Pizza createPizza(String type) {
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
