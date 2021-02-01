package compoundPattern.duck;

import compoundPattern.observe.Oberverable;
import compoundPattern.observe.Observer;

public class RedheadDuck implements Quackable {

    private Oberverable oberverable;

    public RedheadDuck() {
        oberverable = new Oberverable();
    }

    @Override
    public void quack() {
        System.out.println("quack");
        this.notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        oberverable.registerObserver(observer);
    }

    @Override
    public void notifyAllObservers() {
        oberverable.notifyAllObservers();
    }
}
