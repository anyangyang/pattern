package compoundPattern;

import compoundPattern.decortator.QuackCounter;
import compoundPattern.duck.Quackable;
import compoundPattern.factory.AbstractDuckFactory;
import compoundPattern.factory.CountingDuckFactory;
import compoundPattern.observe.QuackLogist;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        System.out.println("\nduck simulator\n");
        simulator.simulate(new AbstractDuckFactory(), true);
        System.out.println("\nduck counting decorator\n");
        simulator.simulate(new CountingDuckFactory(), false);
        System.out.println("the ducks quacked " + QuackCounter.getNumOfQuack() + " times");
    }


    public void simulate(AbstractDuckFactory duckFactory, Boolean observe) {
        /**基本功能**/
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = duckFactory.createGooseAdapter();
        Quackable flock = duckFactory.createFlockOfDuck();

        if(observe) {
            mallardDuck.registerObserver(new QuackLogist(mallardDuck));
            redheadDuck.registerObserver(new QuackLogist(redheadDuck));
            duckCall.registerObserver(new QuackLogist(duckCall));
            rubberDuck.registerObserver(new QuackLogist(rubberDuck));
            gooseAdapter.registerObserver(new QuackLogist(gooseAdapter));
            flock.registerObserver(new QuackLogist(flock));
        }


        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);
        simulate(flock);
    }


    public void simulate(Quackable quackable) {
        quackable.quack();
    }

}
