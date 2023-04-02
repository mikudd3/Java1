package com.lanqiao.javalearn.java1.test2;

import java.util.Scanner;

/**
 * 计算圆柱体的体积
 * @author mikudd3
 */
public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆柱底面半径：");
        int r = input.nextInt();
        System.out.println("请输入圆柱的高：");
        int h = input.nextInt();

        final float PI = 3.14f;
        float s = PI * r * r;
        System.out.println("该圆柱体的体积为：" + (s * h));
    }
}
