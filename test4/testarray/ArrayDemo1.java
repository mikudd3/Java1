package com.lanqiao.javalearn.java1.test4.testarray;

/**
 * 将数组中的元素进行相加
 *
 * @author mikudd3
 */
public class ArrayDemo1 {
    /**
     * 数组的使用：
     * 1.声明一个数组并确定数组中存放的数组类型（这里是int型）
     * 2.开辟空间来存放数据
     * 3.给开辟的空间中存数据
     * 4.将数组的所有数据相加，求和
     */

    public static void main(String[] args) {

        //声明数组
        int[] a;
        //开辟空间
        a = new int[5];

        //赋值
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        //求和
        int sum = a[0] + a[1] + a[2] + a[3] + a[4];

        System.out.println("和为：" + sum);
    }
}
