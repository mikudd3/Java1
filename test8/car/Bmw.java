package com.lanqiao.javalearn.java1.test8.car;

/**
 * @project: 宝马类
 * @author: mikudd3
 * @version: 1.0
 */
public class Bmw extends Car {

    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
        System.out.println("宝马  3 系列");
        System.out.println("宝马  5 系列");
        System.out.println("宝马  7 系列");
    }

    public void carModel() {
        info();
    }
}
