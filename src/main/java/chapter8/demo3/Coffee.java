package chapter8.demo3;

import java.util.Scanner;

public class Coffee extends CoffineBeverage {

    @Override
    public void brew() {
        System.out.println("brew coffee grainds");
    }

    @Override
    public void addCondiment() {
        System.out.println("add sugar and milk");
    }

}
