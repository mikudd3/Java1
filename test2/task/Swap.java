package com.lanqiao.javalearn.java1.test2.task;

/**
 * 两数互换，即a的值赋给b，b的值赋给a（选做：考虑用多种方式实现）
 * @author mikudd3
 */
public class Swap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //交换
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
