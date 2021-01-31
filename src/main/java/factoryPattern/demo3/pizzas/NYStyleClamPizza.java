package factoryPattern.demo3.pizzas;

public class NYStyleClamPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("NYStyle ClamPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYStyle ClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYStyle ClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYStyle ClamPizza box");
    }
}
