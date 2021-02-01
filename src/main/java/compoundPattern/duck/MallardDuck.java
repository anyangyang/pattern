package compoundPattern.duck;

import compoundPattern.observe.Oberverable;
import compoundPattern.observe.Observer;

public class MallardDuck implements Quackable {

    private Oberverable oberverable;

    public MallardDuck() {
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
