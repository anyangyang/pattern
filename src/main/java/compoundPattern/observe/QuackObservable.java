package compoundPattern.observe;

public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyAllObservers();

}
