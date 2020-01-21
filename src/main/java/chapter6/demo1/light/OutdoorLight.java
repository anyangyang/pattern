package chapter6.demo1.light;

import chapter6.demo1.light.Light;

public class OutdoorLight implements Light {

    @Override
    public void on() {
        System.out.println("Outdoor light on");
    }

    @Override
    public void off() {
        System.out.println("Outdoor light off");
    }
}
