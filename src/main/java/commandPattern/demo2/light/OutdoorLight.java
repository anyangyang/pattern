package commandPattern.demo2.light;

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
