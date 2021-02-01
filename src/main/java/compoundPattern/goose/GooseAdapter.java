package compoundPattern.goose;
import compoundPattern.duck.Quackable;
import compoundPattern.observe.Oberverable;
import compoundPattern.observe.Observer;

public class GooseAdapter extends Oberverable implements Quackable {

    private  Goose goose;
    private Oberverable oberverable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        oberverable = new Oberverable();
    }

    @Override
    public void quack() {
        goose.honk();
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
