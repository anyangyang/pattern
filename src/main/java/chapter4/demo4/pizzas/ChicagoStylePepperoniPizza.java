package chapter4.demo4.pizzas;

public class ChicagoStylePepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("ChicagoStyle PepperoniPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyle PepperoniPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyle PepperoniPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyle PepperoniPizza box");
    }

}
