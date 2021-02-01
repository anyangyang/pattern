package compoundPattern.duck;

import compoundPattern.observe.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
