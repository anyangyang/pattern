package chapter4.demo3.pizzas;

public class ChicagoStyleCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Chicago CheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chicago CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Chicago CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago CheesePizza box");
    }
}
