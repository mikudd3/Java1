package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * if 双分支选择结构的使用
 *
 * @author mikudd3
 */
public class IfDemo2 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner input = new Scanner(System.in);

        System.out.print("请输入小蓝的年龄：");
        // 定义变量接收从控制台输入的年龄信息
        int age = input.nextInt();

        // 使用比较运算符完成年龄比对，进入对应的分支
        if (age >= 18) {
            System.out.println("小蓝参加的是成年组比赛");
        } else {
            System.out.println("小蓝参加的是少年组比赛");
        }
    }
}

