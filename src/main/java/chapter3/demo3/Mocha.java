package chapter3.demo3;


import java.math.BigDecimal;

/**
 * condiment
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDesciption() {
        return this.beverage.getDesciption() + ",Mocha";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("1.5").add(this.beverage.getCost());
    }
}
