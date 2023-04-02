package com.lanqiao.javalearn.java1.test4.sort;

/**
 * 定一个插入排序的类
 *
 * @author mikudd3
 */
public class InsertSort {
    /**
     * 实现插入排序的方法
     */
    public void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            //从第二部分中取出第一个元素赋值给temp，temp就是需要确定位置的元素
            int temp = a[i];
            int t = i - 1;
            //不断往前寻找，直到a[t]≤temp或者t<0时终止
            while (t >= 0 && a[t] > temp) {
                a[t + 1] = a[t];
                t--;
            }
            //下标t+1的位置就是temp的位置
            a[t + 1] = temp;
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
}
