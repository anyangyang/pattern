package statePattern.demo2;

public class SoldOutState extends State{

    public SoldOutState(GumballMechine gumballMechine) {
        this.gumballMechine = gumballMechine;
        this.state = "SOLD_OUT";
    }

    @Override
    void insertQuarter() {
        System.out.println("you can't insert a quarter, the machine is sold out");
    }

    @Override
    void ejectQuarter() {
        System.out.println("you can't eject, you haven't inserted a quarter yet");
    }

    @Override
    void turnCrank() {
        System.out.println("you turned, but there is no gumball");
    }

    @Override
    void dispense() {
        System.out.println("no gumball dispense");
    }
}
