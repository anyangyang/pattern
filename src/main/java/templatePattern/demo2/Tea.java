package templatePattern.demo2;

public class Tea extends CoffineBeverage {

    @Override
    public void brew() {
        System.out.println("steep tea bag");
    }

    @Override
    public void addCondiment() {
        System.out.println("add lemon");
    }
}
