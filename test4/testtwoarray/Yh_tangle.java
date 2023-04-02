package com.lanqiao.javalearn.java1.test4.testtwoarray;

/**
 * @project      : 实现等腰杨辉三角
 * @Author       :mikudd3
 */
public class Yh_tangle {
    public void yh(int n) {  //实现输出等腰杨辉三角的方法
        int[][] yh = new int[n][n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= n - 1 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    yh[i][j] = 1;
                    System.out.printf("%4d", yh[i][j]);
                } else {
                    yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];
                    System.out.printf("%4d", yh[i][j]);
                }
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += yh[i][j];
            }
        }

        System.out.println("前十行总和：" + sum);
    }
}
