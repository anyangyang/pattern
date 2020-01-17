package chapter4.demo3.pizzas;

public class ChicagoStyleClamPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("ChicagoStyle ClamPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoStyle ClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoStyle ClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoStyle ClamPizza box");
    }
}
