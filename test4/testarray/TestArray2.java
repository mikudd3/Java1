package com.lanqiao.javalearn.java1.test4.testarray;

/**
 * @author mikudd3
 */
public class TestArray2 {
    public static void main(String[] args) {

        //定义数组
        int[] arr1 = new int[3];

        //数组索引进行赋值
        arr1[0] = 5;
        arr1[1] = 6;
        arr1[2] = 7;

        //输出3个索引上的元素值
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        //定义数组变量arr2，将arr的地址赋值给arr2

        int[] arr2 = arr1;
        arr2[1] = 9;

        System.out.println(arr2[1]);
    }
}