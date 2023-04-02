package com.lanqiao.javalearn.java1.test9.org;

public class Test {
    public static void main(String[] args) {

        //矩形
        Rectangle re = new Rectangle(3.0,8.0);
        System.out.println("矩形的周长为：" + re.getPerimeter());
        System.out.println("矩形的面积为：" + re.getArea());

        //三角形
        Triangle tr = new Triangle(3.3,3.4,3.5);
        System.out.println("三角形的周长为：" + tr.getPerimeter());
        System.out.println("三角形的面积为：" + tr.getArea());
    }
}
