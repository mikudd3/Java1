package com.lanqiao.javalearn.java1.test3.task;

import java.util.Scanner;

/**
 * project 打印直角三角形，三角形的行数从控制台输入。比如：控制台输入4，则打印一个4行的直角三角形：
 * @author mikudd3
 */
public class ZhiJiao {
    public static void main(String[] args) {
        System.out.println("直角三角形行数：");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
