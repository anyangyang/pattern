package chapter8.demo1;

public class Coffee implements Beverage{

    @Override
    public void prepareRecipe() {
        this.boidWater();
        this.brewCoffeeGrinds();
        this.pourInCup();
        this.addSugarAndMilk();
    }

    private void boidWater() {
        System.out.println("boil water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("brew coffee grinds");
    }

    private void pourInCup() {
        System.out.println("pour in cup");
    }

    private void addSugarAndMilk() {
        System.out.println("add sugar and milk");
    }
}
