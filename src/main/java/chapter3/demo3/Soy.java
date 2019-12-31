package chapter3.demo3;

import java.math.BigDecimal;

/**
 * condiment: 酱油
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDesciption() {
        return this.beverage.getDesciption() + ",Soy";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("0.5").add(this.beverage.getCost());
    }
}
