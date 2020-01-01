package chapter3.demo3;

import java.math.BigDecimal;

/**
 * condiment: 酱油
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage, Integer num) {
        super(beverage, num);
    }

    @Override
    String getDesciption() {
        return this.beverage.getDesciption() + ",Soy [ " + this.num + " ]";
    }

    @Override
    BigDecimal getCost() {
        BigDecimal num = new BigDecimal(this.num);
        return new BigDecimal("0.5").multiply(num).add(this.beverage.getCost());
    }
}
