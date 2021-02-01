package compoundPattern.factory;

import compoundPattern.duck.Quackable;
import compoundPattern.duck.*;
import compoundPattern.goose.Goose;
import compoundPattern.goose.GooseAdapter;

import java.util.ArrayList;

public class AbstractDuckFactory {

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }


    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    public Quackable createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }

    public Quackable createFlockOfDuck() {

        Flock flock = new Flock(new ArrayList<Quackable>());
        flock.addQuackaable(this.createDuckCall());
        flock.addQuackaable(this.createMallardDuck());
        flock.addQuackaable(this.createRedheadDuck());
        flock.addQuackaable(this.createRubberDuck());
        flock.addQuackaable(this.createGooseAdapter());

        return flock;
    }


}
