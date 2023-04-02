package com.lanqiao.javalearn.java1.test4.testdoublearray;

import java.util.Scanner;

/**
 * @project: 计算科目成绩
 * @author: mikudd3
 * @version: 1.0
 */
public class CountScore {

    Scanner input = new Scanner(System.in);

    /**
     * 输入成绩
     */
    public void inputScore(String[] course, String[] name, int[][] stuScore) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("请输入科目：" + course[i] + " 学生：" + name[j] + " 的成绩：");
                //读取学生成绩
                stuScore[i][j] = input.nextInt();
            }
        }
    }

    /**
     * 计算各科的平均成绩，将结果存储在singleSum数组中，并返回
     */
    public int[] eachAvgScore(String[] course, int[][] stuScore) {

        //创建平均成绩数组
        int[] singLeSum = new int[]{0, 0, 0};
        //对单科成绩累加
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                //单科成绩累加
                singLeSum[i] += stuScore[i][j];

            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("科目：" + course[i] + "的平均成绩：" + singLeSum[i] / 4.0);
        }
        return singLeSum;
    }

    /**
     * 计算所有科目的平均成绩
     */
    public void totalAvgScore(int[] singLeSum) {

        //总成绩
        int allScore = 0;
        //对成绩累加
        for (int i = 0; i < 3; i++) {
            allScore += singLeSum[i];
        }
        System.out.println("总平均成绩:" + allScore / 12.0);

    }

}
