package chapter4.demo4.pizzas;

/**
 * 蔬菜
 */
public class ChicagoStyleVeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("ChicagoStyle VeggiePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyle VeggiePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyle VeggiePizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyle VeggiePizza box");
    }
}
