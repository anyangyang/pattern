package compoundPattern.factory;

import compoundPattern.duck.Quackable;
import compoundPattern.decortator.QuackCounter;
import compoundPattern.duck.*;
import compoundPattern.goose.Goose;
import compoundPattern.goose.GooseAdapter;

import java.util.ArrayList;

public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGooseAdapter() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }

    @Override
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
