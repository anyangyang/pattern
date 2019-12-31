package chapter3.demo3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
