package com.lanqiao.javalearn.java1.test4.testdoublearray;

import java.util.Scanner;

/**
 * @project: 找二维数组中的数据
 * @author: mikudd3
 * @version: 1.0
 */
public class FindElement {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};
        //输入
        var input = new Scanner(System.in);

        //查找的数字
        System.out.println("请输入你要查找的数字：");
        int target = input.nextInt();

        System.out.println(findNum(array, target));


    }

    public static boolean findNum(int[][] arr, int target) {

        //创建指针
        int row = 0;                    //行指针
        int colum = arr[0].length - 1;  //列指针

        //查找
        while (row < arr.length && colum >= 0) {
            //如果数字比目标大
            if (arr[row][colum] > target) {
                colum--;
            } else if (arr[row][colum] < target) {
                //如果比目标值小
                row ++;
            } else {
                return true;
            }

        }

        return false;
    }
}
