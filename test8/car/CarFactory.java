package com.lanqiao.javalearn.java1.test8.car;

/**
 * @project: 汽车工厂类
 * @author: mikudd3
 * @version: 1.0
 */

public class CarFactory {
    /**
     * 根据名字，获取不同品牌的汽车对象
     *
     * @param name 品牌名
     * @return Car 汽车对象
     */
    public static Car getCar(String name) {
        if ("Bmw".equalsIgnoreCase(name)) {
            return new Bmw();
        } else if ("Benz".equalsIgnoreCase(name)) {
            return new Benz();
        } else {
            return null;
        }
    }
}
