package chapter4.demo2;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("clam");
        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("unknown");
    }
}
