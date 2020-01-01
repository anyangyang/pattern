package chapter3.demo2;

import java.math.BigDecimal;

/**
 * condiment
 */
public class Mocha extends Condiment {

    public Mocha(Integer num) {
        super(num);
    }

    @Override
    String getDesciption() {
        return "Mocha [ " + num + " ]";
    }

    @Override
    BigDecimal getCost() {
        BigDecimal num = new BigDecimal(this.num);
        return new BigDecimal("1.5").multiply(num);
    }
}
