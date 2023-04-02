package com.lanqiao.javalearn.java1.test7.constructor;

/**
 * @project: 定一个矩形类
 * @author: mikudd3
 * @version: 1.0
 */
public class Rectangle {
    // 声明宽且默认值为1
    private double width = 1;
    // 声明高且默认值为1
    private double height = 1;

    // 无参构造方法
    public Rectangle() {
    }

    /**
     * 有参构造方法
     */
    public Rectangle(double width, double height) {
        // 用 this 来显示调用当前对象的成员变量
        this.width = width;
        this.height = height;
    }

    /**
     * 获取面积方法
     */
    public double getArea() {
        return width * height;
    }

    /**
     * 获取周常方法
     */
    public double getPeHmeter() {
        return (width + height) * 2;
    }
}
