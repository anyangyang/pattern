package chapter8.demo2;

public abstract class CoffineBeverage {

    public void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addCondiment();
    }

    public abstract void brew();
    public abstract void addCondiment();

    private void boilWater() {
        System.out.println("boil water");
    }
    private void pourInCup() {
        System.out.println("pour in cup");
    }
}
