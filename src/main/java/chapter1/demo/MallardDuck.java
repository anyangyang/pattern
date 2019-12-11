package chapter1.demo;

import chapter1.demo.fly.FlyWithWing;

public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehavior = new FlyWithWing();
    }

    @Override
    void display() {
        System.out.println("mallard duck");
    }

}

