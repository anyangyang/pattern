package compoundPattern.duck;

import compoundPattern.observe.Oberverable;
import compoundPattern.observe.Observer;

public class DuckCall implements Quackable {

    private Oberverable oberverable;

    public DuckCall() {
        oberverable = new Oberverable();
    }

    @Override
    public void quack() {
        System.out.println("kawk");
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
