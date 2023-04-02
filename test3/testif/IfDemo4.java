package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * if 嵌套结构的使用
 *
 * @author mikudd3
 */
public class IfDemo4 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入小蓝的年龄：");
        // 定义变量接收从控制台输入年龄的信息

        int age = scanner.nextInt();
        System.out.print("请输入小蓝的体重：");


        // 定义变量接收从控制台输入的体重信息
        int weight = scanner.nextInt();


        if (age >= 18) {
            System.out.print("小蓝可以参加成年组");
            if (weight >= 70) {
                System.out.println(" 70 公斤级比赛");
            } else if (weight >= 60) {
                System.out.println(" 60 公斤级比赛");
            } else if (weight >= 50) {
                System.out.println(" 50 公斤级比赛");
            } else {
                System.out.println("但很遗憾，因为体重不达标，小蓝不能参加比赛");
            }
        } else {
            System.out.print("小蓝可以参加少年组");
            if (weight >= 70) {
                System.out.println(" 70 公斤级比赛");
            } else if (weight >= 60) {
                System.out.println(" 60 公斤级比赛");
            } else if (weight >= 50) {
                System.out.println(" 50 公斤级比赛");
            } else {
                System.out.println("但很遗憾，因为体重不达标，小蓝不能参加比赛");
            }
        }

    }
}

