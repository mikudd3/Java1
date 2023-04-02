package com.lanqiao.javalearn.java1.test3.testfor;

import java.util.Scanner;

/**
 * project 九九乘法表
 * @author mikudd3
 */
public class TestFor2 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;//定义三个变量

        Scanner input = new Scanner(System.in);

        System.out.println("请输入数字");
        c = input.nextInt();

        System.out.println("数" + c + "的乘法表为：");
        for (a = 0, b = c; a <= c; a++, b--) {
            System.out.println(a + "*" + b + "=" + a * b);
        }

    }
}
