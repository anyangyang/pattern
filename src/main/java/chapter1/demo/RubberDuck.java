package chapter1.demo;

import chapter1.demo.fly.FlyNoWay;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
    }

    void display() {
        System.out.println("rubber duck");
    }
}
