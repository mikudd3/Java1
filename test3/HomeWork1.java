package com.lanqiao.javalearn.java1.test3;

import java.util.Scanner;

/**
 * 斐波那契数列
 *
 * @author mikudd3
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查找的斐波那契数列的位置：");
        int n = input.nextInt();

        int a1 = 0;
        int a2 = 1;
        int a3 = 0;
        if (n < 3) {
            a3 = 1;
        } else {
            for (int i = 3; i <= n; i++) {
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
            }
        }

        System.out.println("第" + n + "个位置是" + a3);
    }
}
