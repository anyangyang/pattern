package factoryPattern.demo4;

public class Main {

    public static void main(String[] args) {
        NYPizzaStore newYorkStore = new NYPizzaStore();
        newYorkStore.orderPizza("cheese");
        newYorkStore.orderPizza("clam");
        newYorkStore.orderPizza("veggie");

        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");
        chicagoStore.orderPizza("clam");
        chicagoStore.orderPizza("veggie");
        chicagoStore.orderPizza("pepperoni");
    }

}
