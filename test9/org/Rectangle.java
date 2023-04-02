package com.lanqiao.javalearn.java1.test9.org;

public class Rectangle implements Figure {
    private double width;   //矩形的宽
    private double height;  //矩形的高

    //构造函数
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    //求周长
    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    //求面积
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Perimeter = " + getPerimeter() +
                "Area = " + getArea() +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
