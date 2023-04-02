package com.lanqiao.javalearn.java1.test4.sort;

/**
 * 定义一个测试类
 *
 * @author mikudd3
 */
public class TestBubbleSort {
    public static void main(String[] args) {
        // 声明数组并赋值
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        // 创建对象
        BubbleSort bSort = new BubbleSort();

        //输出排序之前的内容
        System.out.println("排序前的数据为:");
        bSort.showArray(a);

        //调用排序方法排序
        bSort.bubbleSort(a);

        //输出排序之后的内容
        System.out.println("\n" + "排序后的数据为:");
        bSort.showArray(a);
    }
}