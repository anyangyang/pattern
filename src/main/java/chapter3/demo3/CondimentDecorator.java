package chapter3.demo3;

public abstract class CondimentDecorator extends Beverage {

    public Integer num;

    /**
     * 被装饰器装饰的类
     */
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage, Integer num) {
        this.beverage = beverage;
        if(num == null) {
            num = 1;
        }

        this.num = num;
    }


}
