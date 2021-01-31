package statePattern.demo2;

public class NoQuarterState extends State{

    public NoQuarterState(GumballMechine gumballMechine) {
        this.gumballMechine = gumballMechine;
        this.state = "NO_QUARTER";
    }

    @Override
    public void insertQuarter() {
        System.out.println("you inserted a quarter");
        this.gumballMechine.setState(this.gumballMechine.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");
    }
}
