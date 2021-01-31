package statePattern.demo2;

public class HasQuarterState extends State{

    public HasQuarterState(GumballMechine gumballMechine) {
        this.gumballMechine = gumballMechine;
        this.state = "HAS_QUARTER";
    }

    @Override
    void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    void ejectQuarter() {
        System.out.println("quarter returned");
        this.gumballMechine.setState(gumballMechine.NO_QUARTER);
    }

    @Override
    void turnCrank() {
        System.out.println("you turned...");
        this.gumballMechine.setState(gumballMechine.GUNBALL_SOLD);
        this.gumballMechine.dispense();
    }

    @Override
    void dispense() {
        System.out.println("No gumball dispense");
    }
}
