package chapter4.demo5.pizzaStore;

import chapter4.demo5.factory.ChicagoIngredientFactory;
import chapter4.demo5.pizzaStore.PizzaStore;
import chapter4.demo5.pizzas.NYStyleCheesePizza;
import chapter4.demo5.pizzas.NYStyleClamPizza;
import chapter4.demo5.pizzas.NYStyleVeggiePizza;
import chapter4.demo5.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore() {
        this.ingredientFactory = new ChicagoIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        if("cheese".equals(type)) {       // 奶酪
            return new NYStyleCheesePizza(ingredientFactory);
        }
        else if ("clam".equals(type)) {   // 蛤蜊
            return new NYStyleClamPizza(ingredientFactory);
        }
        else if ("veggie".equals(type)) {  // 蔬菜
            return new NYStyleVeggiePizza(ingredientFactory);
        }
        else {
            throw new RuntimeException("unknown new york style pizza type [ " + type + " ]");
        }
    }
}
