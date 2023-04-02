package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * project 判断成绩类型
 * @author mikudd3
 */
public class TestIf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入王云同学Java考试成绩：");
        int javaScore = input.nextInt();

        if(javaScore >= 85){
            System.out.println("恭喜你，成绩优秀！");
        }else if(javaScore >= 70){
            System.out.println("恭喜你，成绩良好！");
        }else if(javaScore >= 60){
            System.out.println("恭喜你，成绩及格！");
        }else {
            System.out.println("很抱歉，成绩不及格");
        }
    }
}
