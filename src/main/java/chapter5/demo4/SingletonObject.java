package chapter5.demo4;

public class SingletonObject {

    private static volatile SingletonObject uniqueObject;

    private SingletonObject() {}

    public static SingletonObject getInstance() {
        if(uniqueObject == null) {
            synchronized (SingletonObject.class) {
                if(uniqueObject == null) {
                    uniqueObject = new SingletonObject();
                }
            }
        }
        return uniqueObject;
    }
}
