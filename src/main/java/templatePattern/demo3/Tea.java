package templatePattern.demo3;

import java.util.Scanner;

public class Tea extends CoffineBeverage {

    @Override
    public void brew() {
        System.out.println("steep tea bag");
    }

    @Override
    public void addCondiment() {
        System.out.println("add lemon");
    }

    @Override
    public Boolean customerWantCondiment() {
        return "Y".equalsIgnoreCase(getCustomerInput());
    }

    private String getCustomerInput() {
        System.out.println("Do you want comdiment? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
