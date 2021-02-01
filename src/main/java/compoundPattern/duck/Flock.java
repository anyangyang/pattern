package compoundPattern.duck;

import compoundPattern.observe.Oberverable;
import compoundPattern.observe.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{
    private List<Quackable> list;
    private Oberverable oberverable;

    public Flock(List<Quackable> list) {
        this.list = list;
        oberverable = new Oberverable();
    }


    public void addQuackaable(Quackable quackable) {
        if(quackable == null) {
            return;
        }
        if(list == null) {
            list = new ArrayList<>();
        }
        list.add(quackable);
    }

    @Override
    public void quack() {
        System.out.println("\na flock of duck");
        if(list == null) {
            return;
        }
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Quackable quackable = (Quackable)it.next();
            quackable.quack();
        }

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
