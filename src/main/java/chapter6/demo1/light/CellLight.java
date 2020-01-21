package chapter6.demo1.light;

public class CellLight implements Light{

    @Override
    public void on() {
        System.out.println("Cell light on");
    }

    @Override
    public void off() {
        System.out.println("Cell light off");
    }

    public void dim() {
        System.out.println("Cell light dim");
    }

    public void bright() { System.out.println("Cell light bright"); }

}
