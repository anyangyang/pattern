package chapter3.demo3;


import java.math.BigDecimal;

/**
 * condiment
 */
public class StreamMilk extends CondimentDecorator {

    public StreamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDesciption() {
        return this.beverage.getDesciption() + ",StreamMilk";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("0.8").add(this.beverage.getCost());
    }
}
