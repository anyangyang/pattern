package chapter4.demo4.pizzas;

public class NYStyleVeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("NYStyle VeggiePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYStyle VeggiePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYStyle VeggiePizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYStyle VeggiePizza box");
    }
}
