package com.lanqiao.javalearn.java1.test3.testswitch;

import java.util.Scanner;

/**
 * switch 语句的基本使用
 *
 * @author mikudd3
 */
public class Preview2 {
    public static void main(String[] args) {

        // 创建键盘录入对象
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的名次：");
        // 定义变量接收从控制台输入的信息
        int places = input.nextInt();

        // 使用 switch 完成名次比对，进入对应的分支
        switch (places) {
            case 1:
                System.out.println("第一名奖励电脑一台");
                break;
            case 2:
                System.out.println("第二名奖励手机一部");
                break;
            case 3:
                System.out.println("第三名奖励硬盘一个");
                break;
            case 4:
                System.out.println("第四名奖励键盘一个");
                break;
            default:
                System.out.println("对不起，这个名次没有奖励");
                break;
        }
        System.out.println("颁奖结束，你的名次是:" + places);
    }
}
