package com.lanqiao.javalearn.java1.test3.testswitch;

import java.util.Scanner;

/**
 * project 成绩评价
 * @author mikudd3
 */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入张明美术学习班结业评价（1，2，3，4）：");
        int score = input.nextInt();

        switch(score){
            case 1:
                System.out.println("去九赛沟旅游");
                break;
            case 2:
                System.out.println("奖励变形金刚");
                break;
            case 3:
                System.out.println("不奖不罚，需要努力");
                break;
            case 4:
                System.out.println("负责家里洗碗一周");
                break;
            default:
                System.out.println("输入错误，请重新输入");
                break;


        }
    }
}
