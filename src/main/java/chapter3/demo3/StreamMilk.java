package chapter3.demo3;


import java.math.BigDecimal;

/**
 * condiment
 */
public class StreamMilk extends CondimentDecorator {

    public StreamMilk(Beverage beverage, Integer num) {
        super(beverage, num);
    }

    @Override
    String getDesciption() {
        return this.beverage.getDesciption() + ",StreamMilk [ " + this.num + " ]";
    }

    @Override
    BigDecimal getCost() {
        BigDecimal num = new BigDecimal(this.num);
        return new BigDecimal("0.8").multiply(num).add(this.beverage.getCost());
    }
}
