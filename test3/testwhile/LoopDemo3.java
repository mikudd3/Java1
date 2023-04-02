package com.lanqiao.javalearn.java1.test3.testwhile;

/**
 * 循环嵌套的简单使用
 *
 * @author mikudd3
 */
public class LoopDemo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
