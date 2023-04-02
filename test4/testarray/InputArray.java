package com.lanqiao.javalearn.java1.test4.testarray;

import java.util.Scanner;

/**
 * 数组反转
 *
 * @author mikudd3
 */
public class InputArray {

    /**
     * 键盘录入数组
     */
    public int[] input() {
        var input = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int size = input.nextInt();

        //创建数组
        var arr = new int[size];

        //填充数据
        for (int i = 0; i < size; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据");
            arr[i] = input.nextInt();
        }

        return arr;
    }

    /**
     * 反转数组
     */
    public int[] reverseArray(int[] arr) {

        //临时数组
        var temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        return temp;
    }

    /**
     * 输出数组
     */
    public void showArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}