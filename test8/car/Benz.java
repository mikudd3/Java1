package com.lanqiao.javalearn.java1.test8.car;

/**
 * @project: 奔驰汽车类
 * @author: mikudd3
 * @version: 1.0
 */
public class Benz extends Car {

    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
        System.out.println("5座");
        System.out.println("7座");
        System.out.println("15座");
    }

    public void carConfig() {
        info();
    }
}
