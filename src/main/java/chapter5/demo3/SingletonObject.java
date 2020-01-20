package chapter5.demo3;

public class SingletonObject {

    private static SingletonObject uniqueObject = new SingletonObject();

    private SingletonObject() {}

    public static SingletonObject getInstance() {
        return uniqueObject;
    }
}
