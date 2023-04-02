package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * if 多分支选择结构的使用
 *
 * @author mikudd3
 */
public class IfDemo3 {
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner input = new Scanner(System.in);

        System.out.print("请输入小蓝的体重：");
        // 定义变量接收从控制台输入的体重信息
        int weight = input.nextInt();

        // 使用比较运算符完成体重比对，进入对应的分支
        if (weight >= 70) {
            System.out.println("小蓝可以参加 70 公斤级比赛");
        } else if (weight >= 60) {
            System.out.println("小蓝可以参加 60 公斤级比赛");
        } else if (weight >= 50) {
            System.out.println("小蓝可以参加 50 公斤级比赛");
        } else {
            System.out.println("很遗憾，体重不达标，小蓝不能参加比赛");
        }

    }
}
