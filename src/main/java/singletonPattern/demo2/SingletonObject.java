package singletonPattern.demo2;

public class SingletonObject {

    private static SingletonObject uniqueObject;

    private SingletonObject() {}

    public static synchronized SingletonObject getInstance() {
        if(uniqueObject == null) {
            uniqueObject = new SingletonObject();
        }

        return uniqueObject;
    }
}
