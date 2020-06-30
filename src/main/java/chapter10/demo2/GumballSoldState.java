package chapter10.demo2;

public class GumballSoldState extends State{

    public GumballSoldState(GumballMechine gumballMechine) {
        this.gumballMechine = gumballMechine;
        this.state = "GUMBALL_SOLD";
    }

    @Override
    void insertQuarter() {
        System.out.println("Please wait, we are already giving you a gumball");
    }

    @Override
    void ejectQuarter() {
        System.out.println("Sorry, you have turned crank");
    }

    @Override
    void turnCrank() {
        System.out.println("truing twice does not give you another gumball");
    }

    @Override
    void dispense() {
        System.out.println("a gumball come rolling out of slot");
        this.gumballMechine.setCount(this.gumballMechine.getCount() - 1);     // 设置数量
        if(this.gumballMechine.getCount() == 0) {
            System.out.println("Oops, out of gumballs");
            this.gumballMechine.setState(this.gumballMechine.SOLD_OUT);
        } else {
            this.gumballMechine.setState(this.gumballMechine.NO_QUARTER);
        }

    }
}
