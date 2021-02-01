package compoundPattern.decortator;

import compoundPattern.duck.Quackable;
import compoundPattern.observe.Observer;

public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static Integer numOfQuack = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        this.numOfQuack++;
    }

    public static Integer getNumOfQuack() {
        return numOfQuack;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyAllObservers() {
    }
}
