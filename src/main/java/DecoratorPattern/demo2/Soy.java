package DecoratorPattern.demo2;

import java.math.BigDecimal;

/**
 * condiment: 酱油
 */
public class Soy extends Condiment {

    public Soy(Integer num) {
        super(num);
    }

    @Override
    String getDesciption() {
        return "Soy [ " + num + " ]";
    }

    @Override
    BigDecimal getCost() {
        BigDecimal num = new BigDecimal(this.num);
        return new BigDecimal("0.5").multiply(num);
    }
}
