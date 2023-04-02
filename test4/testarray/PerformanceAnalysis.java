package com.lanqiao.javalearn.java1.test4.testarray;

import java.util.Scanner;

/**
 * 定义一个 PerformanceAnalysis 类
 *
 * @author mikudd3
 */
public class PerformanceAnalysis {
    //定义输入
    static Scanner input = new Scanner(System.in);

    /**
     * 控制台输入数组长度和数组元素，需要注意成绩可能不是整数，因此使用 double 类型的数组
     *
     * @return 包含输入元素的数组
     */
    public static double[] inputNum() {
        System.out.println("请输入数组的长度：");
        int size = input.nextInt();
        //创建数组
        var arr = new double[size];
        //填充数据
        for (int i = 0; i < size; i++) {
            System.out.println("请输入下一个数据：");
            arr[i] = input.nextDouble();
        }
        return arr;
    }

    /**
     * 计算平均成绩
     *
     * @param array 包含所有成绩的数组
     * @return 平均成绩
     */
    public static double average(double[] array) {
        //定义和
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    /**
     * 传入成绩数组和平均成绩，统计成绩大于平均成绩的人数
     *
     * @param array   成绩数组
     * @param average 平均成绩
     * @return 大于平均成绩的人数
     */
    public static int averageNum(double[] array, double average) {
        //定义人数
        int num = 0;
        for (double a : array) {
            if (a > average) {
                num++;
            }
        }
        return num;
    }

    /**
     * 查找成绩数组中的最大值
     *
     * @param array 成绩数组
     * @return 最大值
     */
    public static double findMax(double[] array) {
        //定义最大值
        double max = array[0];
        for (double num : array) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    /**
     * 查找成绩数组中的最小值
     *
     * @param array 成绩数组
     * @return 最小值
     */
    public static double findMin(double[] array) {
        //定义最小值
        double min = array[0];
        for (double num : array) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    /**
     * 统计及格人数
     *
     * @param array 成绩数组
     * @return 及格人数
     */
    public static int passNum(double[] array) {
        //定义及格人数
        int num = 0;
        for (double a : array) {
            if (a >= 60) {
                num++;
            }
        }
        return num;
    }

    /**
     * 程序的入口
     * 调用上面的方法，完成功能
     */
    public static void main(String[] args) {
        //创建数组
        var arr = inputNum();
        //及格人数
        System.out.println("及格人数：" + passNum(arr));
        //平均分
        System.out.println("平均分为：" + average(arr));
        //优秀人数
        System.out.println("优秀人数：" + averageNum(arr, average(arr)));
        //最高分
        System.out.println("最高分" + findMax(arr));
        //最低分
        System.out.println("最低分：" + findMin(arr));
    }
}
