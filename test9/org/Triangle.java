package com.lanqiao.javalearn.java1.test9.org;

public class Triangle implements Figure {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //周长
    @Override
    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    //面积
    @Override
    public double getArea() {
        double p = (getSide1() + getSide2() + getSide3()) / 2;

        return Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Perimeter = " + getPerimeter() +
                "Area = " + getArea() +
                '}';
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
