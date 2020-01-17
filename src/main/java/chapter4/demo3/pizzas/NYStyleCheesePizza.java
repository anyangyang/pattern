package chapter4.demo3.pizzas;

public class NYStyleCheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("NYStyle CheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYStyle CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYStyle CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYStyle CheesePizza box");
    }
}
