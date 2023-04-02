package com.lanqiao.javalearn.java1.test4.sort;

/**
 * 定一个测试类
 *
 * @author mikudd3
 */
public class TestInsertSort {
    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        // 创建 InsertSort 对象
        var is = new InsertSort();

        System.out.println("排序前的数据为:");
        is.showArray(a);  // 调用输出数组内容的方法
        is.insertSort(a); // 调用插入排序的方法
        System.out.println("\n" + "排序后的数据为:");
        is.showArray(a);  // 调用输出数组内容的方法

    }
}
