package DecoratorPattern.demo3;

import java.math.BigDecimal;

/**
 * 饮料
 */
public abstract class Beverage {

    /**
     * 获取饮料的描述
     *
     * @return
     */
    abstract String getDesciption();

    /**
     * 获取金额
     *
     * @return
     */
    abstract BigDecimal getCost();
}
