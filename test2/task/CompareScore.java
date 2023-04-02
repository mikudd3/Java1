package com.lanqiao.javalearn.java1.test2.task;

import java.util.Scanner;

/**
 * 编写JAVA程序，实现接收张三和李四的Java成绩，比较两人成绩高低，并输出分值差
 * @author mikudd3
 */

public class CompareScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //张三的Java成绩
        System.out.println("请输入张三的Java成绩：");
        int score1 = input.nextInt();

        System.out.println("请输入李四的Java成绩：");
        int score2 = input.nextInt();

        System.out.println(((score1 > score2) ? "张三Java成绩高" : "李四Java成绩高"));

        System.out.println("分差值为：" + ((score1 > score2) ? (score1 - score2) : (score2 - score1)));
    }
}
