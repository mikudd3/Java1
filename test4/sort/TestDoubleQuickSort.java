package com.lanqiao.javalearn.java1.test4.sort;


/**
 * 定义一个测试类
 *
 * @author mikudd3
 */
public class TestDoubleQuickSort {
    public static void main(String[] args) {
        int[] a = {12, 32, 13, 45, 34, 65, 76, 78, 89, 57};

        //创建对象
        var dps = new DoubleQuickSort();

        System.out.println("排序前的数据为:");
        dps.showArray(a); // 调用输出数组内容的方法
        dps.quickSort(a, 0, 9); // 调用递归调用双向扫描方法
        System.out.println("\n" + "排序后的数据为:");
        dps.showArray(a); // 调用输出数组内容的方法
    }
}
