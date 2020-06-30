package chapter10.demo2;

public abstract class State {

    public GumballMechine gumballMechine;

    public String state;

    abstract void insertQuarter();

    abstract void ejectQuarter();

    abstract void turnCrank();

    abstract void dispense();

    public String toString() {
        return this.state;
    }
}
