package com.lanqiao.javalearn.java1.test3.testwhile;

import java.util.Scanner;

/**
 * 累加方式加强训练
 *
 * @author mikudd3
 */
public class WhileLoopChallenge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入剩余天数：");
        int day = input.nextInt();

        //和
        int sum = 0;
        while (day != 0) {
            sum += day;
            day--;
        }

        System.out.println("共训练了" + sum + "次");
    }
}
