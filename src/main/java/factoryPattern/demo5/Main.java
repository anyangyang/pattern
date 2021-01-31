package factoryPattern.demo5;

import factoryPattern.demo5.pizzaStore.ChicagoPizzaStore;
import factoryPattern.demo5.pizzaStore.NYPizzaStore;

public class Main {

    public static void main(String[] args) {
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");
        chicagoStore.orderPizza("clam");
        chicagoStore.orderPizza("veggie");
        chicagoStore.orderPizza("pepperoni");

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("clam");
        nyPizzaStore.orderPizza("veggie");
        nyPizzaStore.orderPizza("pepperoni");

    }
}
