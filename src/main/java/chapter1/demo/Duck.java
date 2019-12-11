package chapter1.demo;

import chapter1.demo.fly.FlyBehavior;

import javax.swing.plaf.basic.BasicEditorPaneUI;

/**
 *
 * 鸭子
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 发出嘎嘎声
     */
    void quack() {
        System.out.println("quack!");
    }

    /**
     * 游泳
     */
    void swimming() {
        System.out.println("swimming!");
    }

    /**
     * 外表展示
     */
    abstract void display();

    void performeFly() {
        flyBehavior.fly();
    }

}
