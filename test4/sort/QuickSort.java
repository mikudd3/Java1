package com.lanqiao.javalearn.java1.test4.sort;

/**
 * 定义单向扫描快速排序的类
 *
 * @author mikudd3
 */
public class QuickSort {
    /**
     * 实现一次单向扫描，返回边界的下标
     */
    public int pv(int[] arr, int l, int r) {
        // 主元
        int p = arr[l];
        // 扫描指针
        int sp = l + 1;
        int bigger = r;
        while (sp <= bigger) {
            if (arr[sp] <= p)
                sp++;
            else {
                swap(arr, sp, bigger);
                bigger--;
            }
        }
        swap(arr, l, bigger);
        return bigger;
    }

    /**
     * 递归调用单向扫描方法
     */
    public void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int q = pv(arr, l, r);
            quickSort(arr, l, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    /**
     * 输出数组内容
     */
    public void showArray(int[] a) {
        for (int a1 : a) {
            System.out.print(a1 + " ");
        }
    }

    /**
     * 交换 arr[index1]和arr[index2]，即交换数组数据的方法
     */
    public void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
