package com.lanqiao.javalearn.java1.test4.testarray;

/**
 * 将数组中的元素进行相加
 *
 * @author mikudd3
 */
public class ArrayDemo2 {
    /**
     * 数组的使用：
     * 1.声明一个数组的同时开辟空间并赋值
     * 2.将数组的所有数据相加，求和
     */
    public static void main(String[] args) {
        // 声明的同时开辟空间并赋初始值
        int[] a = new int[]{1, 2, 3, 4, 5};
        // 求和。数组名[下标]：就能获取到数组中具体的数据
        int sum = a[0] + a[1] + a[2] + a[3] + a[4];
        System.out.println("和为：" + sum);
    }
}

