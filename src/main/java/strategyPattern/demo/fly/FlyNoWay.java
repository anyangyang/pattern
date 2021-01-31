package strategyPattern.demo.fly;

public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("fly no way!");
    }
}
