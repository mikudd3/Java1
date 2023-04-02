package com.lanqiao.javalearn.java1.test4.testtwoarray;

/**
 * @project : 打印螺旋矩阵
 * @Author  : mikudd3
 */

import java.util.Scanner;

public class TestPrint {
    Scanner input = new Scanner(System.in);
    int m = 0;//行数
    int n = 0; //列数

    //当前正在打印的数字是： arr[row][column]
    int row = 0, column = 0;
    // 约定打印的方向
    int right = 0;
    int down = 1;
    int left = 2;
    int up = 3;
    int[][] arr = null;

    //当前正在打印的方向（从“右”开始）
    int direction = right;

    //当前正在打印第几圈
    int circle = 1;

    //当前正在打印第几个数字
    int count = 0;


    /**
     * 输入行号、列号，并初始化二维数组
     */
    public void input() {
        System.out.println("请输入行数：");
        m = input.nextInt();

        System.out.println("请输入列数：");
        n = input.nextInt();

        //创建数组
        arr = new int[m][n];
    }

    /**
     * 填充二维数组
     */
    public void fillArray() {

        while (count < m * n) {
            //填充数据
            count++;
            //第一个位置数据放1
            arr[row][column] = count;

            switch (direction) {
                case 0:
                    //向右打印
                    //0 < 4 - 1
                    if (column < n - circle) {
                        //列数++
                        column++;
                    } else {
                        //切换到向下打印
                        direction = down;
                        //行数++
                        row++;
                    }
                    break;
                case 1:
                    //向下打印
                    if (row < m - circle) {
                        //行数++
                        row++;
                    } else {
                        //向左打印
                        direction = left;
                        //列数--
                        column--;

                    }
                    break;
                case 2:
                    if (column > circle - 1) {
                        //列数--
                        column--;
                    } else {
                        //向上打印
                        direction = up;
                        row--;
                    }
                    break;
                case 3:
                    if (row > circle) {
                        row--;
                    } else {
                        //已经打印一圈
                        //圈数加1
                        circle++;

                        //转为向右打印
                        direction = right;

                        column++;
                    }
                    break;
            }
        }
    }

    /**
     * 打印
     */
    public void print() {

        for (int[] numArr : arr) {
            for (int num : numArr) {
                if (num < 10) {
                    System.out.print(num + "  ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        TestPrint tp = new TestPrint();

        tp.input();

        tp.fillArray();

        tp.print();
    }
}
