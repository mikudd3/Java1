package com.lanqiao.javalearn.java1.test4.sort;

/**
 * 定义一个双向扫描快速排序的类
 *
 * @author mikudd3
 */
public class DoubleQuickSort {
    //核心代码


    /**
     * 实现一次双向扫描，返回边界的下标
     */
    public int pv2(int[] arr, int l, int r) {
        //主元
        int p = arr[l];

        //左指针
        int left = l + 1;
        //右指针
        int right = r;

        while (left <= right) {
            // left向右走，直到遇见大于主元的元素
            while (left <= right && arr[left] <= p) {
                left++;
            }
            // right向左走，直到遇见小于或等于主元的元素
            while (left <= right && arr[right] > p) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }
        // while退出时，left, right两者交错，且right指向最后一个小于等于主元的元素，
        // 也就是主元应该在的位
        swap(arr, l, right);
        return right;
    }

    /**
     * 递归调用双指针扫描方法
     */
    public void quickSort(int[] arr, int l, int r) {
        if (l < r) {

            int q = pv2(arr, l, r);
            quickSort(arr, l, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    // 输出数组内容
    public void showArray(int[] a) {
        for (int a1 : a) {
            System.out.println(a1 + " ");
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

