package chapter4.demo3;

public class Main {

    public static void main(String[] args) {

        // Chicago
        SimplePizzaFactory ChicagoPizzaFacotry = new ChicagoSimplePizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(ChicagoPizzaFacotry);
        chicagoStore.orderPizza("cheese");
        chicagoStore.orderPizza("veggie");
        chicagoStore.orderPizza("clam");
        chicagoStore.orderPizza("pepperoni");


        // New York
        SimplePizzaFactory NYPizzaFacotry = new NYSimplePizzaFactory();
        PizzaStore newYorkStore = new PizzaStore(NYPizzaFacotry);
        newYorkStore.orderPizza("cheese");
        newYorkStore.orderPizza("veggie");
        newYorkStore.orderPizza("clam");
    }
}
