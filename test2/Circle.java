package com.lanqiao.javalearn.java1.test2;

import java.util.Scanner;

/**
 * 计算任意半径的圆的面积
 * @author mikudd3
 */
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //圆周率
        final float PI = 3.14f;

        System.out.println("请输入圆的半径：");
        int r = input.nextInt();

        //面积
        float s = PI * r * r;
        System.out.println("“圆的面积为：" + s + "”");
    }
}
