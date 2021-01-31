package statePattern.demo2;

public class Main {

    public static void main(String[] args) {
        GumballMechine gumballMechine = new GumballMechine(5);
        // print current state of the gumballMechine
        System.out.println(gumballMechine);

        // first unit test
        System.out.println();
        gumballMechine.insertQuarter();
        gumballMechine.turnCrank();
        System.out.println(gumballMechine);

        // second
        System.out.println();
        gumballMechine.insertQuarter();
        gumballMechine.ejectQuarter();
        gumballMechine.turnCrank();
        System.out.println(gumballMechine);

        // third
        System.out.println();
        gumballMechine.insertQuarter();
        gumballMechine.turnCrank();
        gumballMechine.insertQuarter();
        gumballMechine.turnCrank();
        gumballMechine.ejectQuarter();
        System.out.println(gumballMechine);

        // fourth
        System.out.println();
        gumballMechine.insertQuarter();
        gumballMechine.insertQuarter();
        gumballMechine.turnCrank();
        gumballMechine.insertQuarter();
        gumballMechine.turnCrank();
        gumballMechine.insertQuarter();
        gumballMechine.turnCrank();
        System.out.println(gumballMechine);
    }
}
