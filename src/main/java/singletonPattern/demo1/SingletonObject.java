package singletonPattern.demo1;

public class SingletonObject {

    private static SingletonObject uniqueObject;

    private SingletonObject() {}

    public static SingletonObject getInstance() {
        if(uniqueObject == null) {
            uniqueObject = new SingletonObject();
        }

        return uniqueObject;
    }
}
