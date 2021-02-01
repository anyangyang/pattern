package compoundPattern.observe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Oberverable implements QuackObservable{

    private List<Observer> observers;

    @Override
    public void registerObserver(Observer observer) {
        if(observer == null) {
            return;
        }
        if(observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        if(observers == null) {
            return;
        }
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update();
        }
    }
}
