package chapter4.demo5;

import chapter4.demo5.pizzaStore.ChicagoPizzaStore;
import chapter4.demo5.pizzaStore.NYPizzaStore;

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
