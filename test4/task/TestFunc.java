package com.lanqiao.javalearn.java1.test4.task;

/**
 * project 1. 求两个整数的积
 *     2. 求两个浮点数的和
 *     3. 获取一个数组的长度
 * @author mikudd3
 */
public class TestFunc {

    /**
     * 求两个整数的积
     * @param a
     * @param b
     * @return
     */
    public static int func(int a,int b){
        return a * b;
    }

    /**
     * 求两个浮点数的和
     * @param a
     * @param b
     * @return
     */
    public static double func(double a,double b){
        return a + b;
    }

    /**
     * 获取一个数组的长度
     * @param nums
     * @return
     */
    public static int func(int[] nums){
        return nums.length;
    }

    public static void main(String[] args) {
        //创建数组
        int[] nums = new int[10];

        //获取数组长度
        int length = func(nums);
        System.out.println(length);

        //求两个整数的积
        int num = func(10,20);
        System.out.println(num);


        //两个浮点数的和
        double sum = func(2.0,3.15);
        System.out.println(sum);
    }
}
