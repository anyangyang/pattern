package strategyPattern.demo;

import strategyPattern.demo.fly.FlyNoWay;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
    }

    void display() {
        System.out.println("rubber duck");
    }
}
