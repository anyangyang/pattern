package chapter5.demo2;

import chapter5.demo2.SingletonObject;
import sun.jvm.hotspot.debugger.Page;

import java.io.IOException;
import java.nio.CharBuffer;

public class Main {

    public static void main(String[] args) {
        final SingletonObject[] singletonObjects = new SingletonObject[2];
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                singletonObjects[0] = SingletonObject.getInstance();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                singletonObjects[1] = SingletonObject.getInstance();
            }
        });


        thread1.start();
        thread2.start();



        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {

        }

        SingletonObject obj1 = singletonObjects[0];
        SingletonObject obj2 = singletonObjects[1];
        System.out.println("obj1 = obj2?\n" + (obj1 == obj2));
    }
}
