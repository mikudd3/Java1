package com.lanqiao.javalearn.java1.test4.sort;

/**
 * 定义一个冒泡排序的类
 *
 * @author mikudd3
 */
public class BubbleSort {
    public void bubbleSort(int[] a) {
        //假设数组为 `a` 实际我们只需要执行 `a.length - 1` 次排序

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                //相邻数进行比较，符合条件进行替换
                if (a[j] > a[j + 1]) {
                    swap(a, j + 1, j);
                }
            }
        }
    }

    /**
     * 交换两个数
     *
     * @param a
     * @param i
     * @param j
     */
    public void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;
    }

    /**
     * 输出数组内容
     */
    public void showArray(int[] a) {
        for (int a1 : a) {
            System.out.println(a1 + " ");
        }
    }
}