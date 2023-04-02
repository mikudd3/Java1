package com.lanqiao.javalearn.java1.test7.constructor;

/**
 * @project: 矩形测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class TestRectangle {
    public static void main(String[] args) {
        // 创建对象
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        // 输出矩形 1 的面积和周常
        System.out.println("矩形 1 的面积和周常:");
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPeHmeter());
        // 输出矩形 2 的面积和周常
        System.out.println("矩形 2 的面积和周常:");
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPeHmeter());
    }
}
