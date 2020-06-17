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

    @Override
    public Boolean customerWantCondiment() {
        String customerInput = getCustomerInput();
        if("Y".equalsIgnoreCase(customerInput)) {
            return true;
        }
        return false;
    }

    private String getCustomerInput() {
        System.out.println("Do you want comdiment? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
