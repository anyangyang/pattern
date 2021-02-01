package compoundPattern.observe;

import compoundPattern.duck.Quackable;

public class QuackLogist implements Observer {
    private Quackable duck;

    public QuackLogist(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void update() {
        System.out.println("QuackLogist: " + duck.getClass().getSimpleName() + "just quacked");
    }
}
