package com.lanqiao.javalearn.java1.test3.task;
/**
 * 打印等边三角形，三角形的行数从控制台读入。比如：控制台输入4，则打印一个4行的等腰三角形：
 * @author mikudd3
 */

import java.util.Scanner;
public class DengY {
    public static void main(String[] args) {
        System.out.println("等腰三角形行数：");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
