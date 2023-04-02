package com.lanqiao.javalearn.java1.test4.task;

/**
 * project 打印杨辉三角（选做）
 * @author mikudd3
 */

import java.util.Scanner;

public class TestYH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入杨辉三角行数：");

        int n = input.nextInt();

        makeYH(n);


    }

    /**
     * 实现杨辉三角
     * @param n
     */
    public static void makeYH(int n){

        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    nums[i][j] = 1;
                    System.out.printf("%4d", nums[i][j]);
                } else {
                    nums[i][j] = nums[i-1][j] + nums[i-1][j-1];
                    System.out.printf("%4d", nums[i][j]);
                }
            }
            System.out.println();
        }

    }


}
