package com.lanqiao.javalearn.java1.test9.testabstract;

/**
 * @project: 抽象类的基本使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestAbstract {
    public void chickenCall(Chicken c) {
        c.call();
    }

    public static void main(String[] args) {
        // 抽象类不能实例化
        // Chicken c = new Chicken();
        TestAbstract ta = new TestAbstract();
        ta.chickenCall(new Cock());
        ta.chickenCall(new Hen());
        ta.chickenCall(new Chick());
    }
}







