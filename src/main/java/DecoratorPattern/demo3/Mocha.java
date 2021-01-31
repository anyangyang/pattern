package DecoratorPattern.demo3;


import java.math.BigDecimal;

/**
 * condiment
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage, Integer num) {
        super(beverage, num);
    }

    @Override
    String getDesciption() {
        return this.beverage.getDesciption() + ",Mocha[ " + this.num + " ]";
    }

    @Override
    BigDecimal getCost() {
        BigDecimal num = new BigDecimal(this.num);
        return new BigDecimal("1.5").multiply(num).add(this.beverage.getCost());
    }
}
