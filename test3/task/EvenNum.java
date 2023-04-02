package com.lanqiao.javalearn.java1.test3.task;

/**
 * 打印输出 1- 100 范围内的偶数。
 * @author mikudd3
 */
public class EvenNum {
    public static void main(String[] args) {

        System.out.println("1- 100 范围内的偶数为：");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

    }
}
