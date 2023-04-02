package com.lanqiao.javalearn.java1.test4.task;


import java.util.Scanner;
/**
 * project 写一个printTriangle方法，打印直角三角形。三角形的行数，由主调方法传给printTriangle。
 * @author mikudd3
 */
public class ZhiJiaoPlus {
    /**
     * 打印输出直角三角形
     * @param n
     */
    public static void printTriangle(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("直角三角形行数：");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        printTriangle(n);
    }
}
