package com.lanqiao.javalearn.java1.test3.testbreak;

import java.util.Scanner;

/**
 * 什么时候才能存够钱
 *
 * @author mikudd3
 */
public class Challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请指定每天的生活费：");
        int dayCost = input.nextInt();

        System.out.println("请指定存款目标：");
        int deposit = input.nextInt();

        System.out.println("请指定每隔五天需要花费的金额：");
        int spend = input.nextInt();

        int day = 0;
        int sum = 0;

        while (true) {
            //存钱
            sum += dayCost;
            day++;

            if (sum >= deposit) {
                break;
            }
            if (day % 5 == 0) {
                sum -= spend;
            }
        }
        System.out.println("共花了" + day + "天存储了" + deposit + "天，钱攒够了，先去买手机");
    }
}