package chapter5.demo1;

public class Main {

    public static void main(String[] args) {
        SingletonObject obj1 = SingletonObject.getInstance();
        SingletonObject obj2 = SingletonObject.getInstance();
        System.out.println("obj1 = obj2?\n" + (obj1 == obj2));
    }
}
