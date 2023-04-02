package com.lanqiao.javalearn.java1.test2;

import java.util.Scanner;

/**
 * 计算三位数各位之和
 * Author mikudd3
 */
public class Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //通过 Scanner 类从键盘获取一个三位整数，给出提示字符串 “请输入一个三位数：” 。
        System.out.println("请输入一个三位数：");
        int num = input.nextInt();

        //使用 % 和 / 可以将三位整数的每一位都取出来。
        int a = num % 10;       //个位
        int b = num / 10 % 10;  //十位
        int c = num / 10 / 10;  //百位

        //计算输出的结果按格式 “M 各位之和为：N” ，可以参考挑战运行效果图。
        System.out.println("”" + num + " 各位之和为：" + (a + b + c) + "“");
    }
}
