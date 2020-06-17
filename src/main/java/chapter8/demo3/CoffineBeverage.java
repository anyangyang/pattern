package chapter8.demo3;

public abstract class CoffineBeverage {

    public void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if(customerWantCondiment()) {
            this.addCondiment();
        }
    }

    public abstract void brew();
    public abstract void addCondiment();

    private void boilWater() {
        System.out.println("boil water");
    }
    private void pourInCup() {
        System.out.println("pour in cup");
    }
    // 判断用户是否需要添加, 默认添加
    public Boolean customerWantCondiment() {
        return true;
    }
}
