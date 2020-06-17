package chapter8.demo1;

public class Tea implements Beverage{

    @Override
    public void prepareRecipe() {
        this.boilWater();
        this.steepTeaBag();
        this.pourInCup();
        this.addLemon();
    }

    private void boilWater() {
        System.out.println("boil water");
    }

    private void steepTeaBag() {
        System.out.println("steep tea bag");
    }

    private void pourInCup() {
        System.out.println("pour in cup");
    }

    private void addLemon() {
        System.out.println("add lemon to the tee");
    }
}
