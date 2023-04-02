package com.lanqiao.javalearn.java1.test2;

import java.util.Scanner;

/**
 * 计算正方体的体积
 * @author mikudd3
 */
public class Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入正方体的边长：");
        int side = input.nextInt();

        //体积
        int volume = side * side * side;
        System.out.println("该正方体的体积为：" + volume);
    }
}
