package com.lanqiao.javalearn.java1.test4.sort;

/**
 * 定义测试类
 *
 * @author mikudd3
 */
public class TestQuickSort {
    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        // 创建对象
        var qs = new QuickSort();

        System.out.println("排序前的数据为:");
        qs.showArray(a); // 调用输出数组内容的方法
        qs.quickSort(a, 0, 14); // 调用递归调用单向扫描方法
        System.out.println("\n" + "排序后的数据为:");
        qs.showArray(a); // 调用输出数组内容的方法
    }
}