package com.lanqiao.javalearn.java1.test3;

import java.util.Scanner;

/**
 * 鸡兔同笼
 *
 * @author mikudd3
 */
public class HomeWork2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入头的总数：");
        int head = input.nextInt();

        System.out.println("请输入脚的数量：");
        int foot = input.nextInt();

        //鸡的数量
        int chicken = 1;
        //兔的数量
        int rabbit = 0;

        for (chicken = 1; chicken < head; chicken++) {
            rabbit = head - chicken;
            if (chicken * 2 + rabbit * 4 == foot) {
                break;
            }
        }

        System.out.println("鸡有" + chicken + "只，兔有" + rabbit + "只");
    }
}