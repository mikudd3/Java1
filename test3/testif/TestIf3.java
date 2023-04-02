package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * project 判断学生所属年级
 * @author mikudd3
 */
public class TestIf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数学摸底考试成绩：");
        int score = input.nextInt();

        if (score >= 80) {
            System.out.println("请输入所属年级：（5 -6）");
            int grade = input.nextInt();

            if (grade == 5) {
                System.out.println("你将参加市五年级组比赛");
            } else {
                System.out.println("你将参加市六年级组比赛");
            }
        } else {
            System.out.println("你不能参加比赛");
        }
    }
}
