package strategyPattern.demo;

import strategyPattern.demo.fly.FlyWithWing;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWing();
    }

    @Override
    void display() {
        System.out.println("red head duck");
    }
}
