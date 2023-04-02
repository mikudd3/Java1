package com.lanqiao.javalearn.java1.test2.task;

import java.util.Scanner;

/**
 * 编写JAVA程序，实现接收用户键盘输入的一个3位整数，倒序组合输出
 *     如：
 *     输入： 123
 *     输出： 321
 * @author mikudd3
 */
public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个三位数");

        int num = input.nextInt();

        //倒序后数字
        int reverseNum = (num % 10) * 100 + (num / 10 % 10) * 10 + (num / 100);

        System.out.println("倒序后数字为:" + reverseNum);
    }
}
