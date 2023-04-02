package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * project 判断成绩是否及格
 * @author mikudd3
 */
public class TestIf1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入王云同学Java考试成绩：");
        int javaScore = input.nextInt();

        System.out.println(javaScore >= 60 ? "恭喜你，考试及格" : "考试不及格，需要补考！"


        );
    }
}
