package com.lanqiao.javalearn.java1.test2.task;

import java.util.Scanner;

/**
 *  编写JAVA程序，分别接收用户输入的语文成绩、数学成绩和英语成绩，输出学员总成绩及考试平均分
 * @author mikudd3
 *
 */
public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //输入语文成绩
        System.out.println("请输入语文成绩：");
        int chinese = input.nextInt();

        //数学成绩
        System.out.println("请输入数学成绩：");
        int math = input.nextInt();

        //英语成绩
        System.out.println("请输入英语成绩：");
        int engish = input.nextInt();

        //总成绩
        int sumScore = chinese + math + engish;
        System.out.println("总成绩为：" + sumScore);

        //平均成绩
        double avgScore = sumScore / 3;
        System.out.println("平均成绩为：" + avgScore);
    }
}
