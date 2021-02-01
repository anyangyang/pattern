package compoundPattern.duck;

import compoundPattern.observe.Oberverable;
import compoundPattern.observe.Observer;

public class RubberDuck extends Oberverable implements Quackable {

    private Oberverable oberverable;

    public RubberDuck() {
        oberverable = new Oberverable();
    }

    @Override
    public void quack() {
        System.out.println("squeak");
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
