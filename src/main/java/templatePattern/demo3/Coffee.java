package templatePattern.demo3;

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
