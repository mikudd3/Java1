package com.lanqiao.javalearn.java1.test4.testarray;

import java.util.Scanner;

/**
 *  project 计算Java工程师成绩
 * @author mikudd3
 */
public class TestArray {
    static Scanner input = new Scanner(System.in);

    static String[] course = {"Java基础","前端技术","后端技术"};

    static String[] name = {"mikudd1","mikudd2","mikudd3","mikudd4"};

    static int[][] stuScore = new int[3][4];

    /**
     * 输入学生成绩
     */
    public static void inputScore(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("请输入科目：" + course[i] + "学生：" + name[j] + "的成绩：");
                stuScore[i][j] = input.nextInt();
            }
        }
    }

    /**
     * 计算学生的平均成绩
     * @return
     */
    public static int[] eachAvgScore(){
        int[] singleSum = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                singleSum[i] += stuScore[i][j];

            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("科目：" + course[i] + "的平均成绩：" + singleSum[i] / 4.0);
        }

        return singleSum;
    }

    /**
     * 计算学生总成绩
     * @param singleSum
     */
    public static void totalAvgScore(int[] singleSum){
        int allScore = 0;

        for (int i = 0; i < 3; i++) {
            allScore += singleSum[i];
        }

        System.out.println("总平均成绩为：" + allScore / 12.0);
    }

    public static void main(String[] args) {
        //输入成绩
        inputScore();

        //计算各科平均成绩
        int[] singleSum = eachAvgScore();

        //计算全部科目的平均成绩
        totalAvgScore(singleSum);
    }
}
