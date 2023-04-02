package com.lanqiao.javalearn.java1.test6.testmethod;

/**
 * @project: 成员方法的使用
 * @author: mikudd3
 * @version: 1.0
 */

public class TestPrint {
    /**
     * main 方法是程序的入口
     */
    public static void main(String[] args) {
        // 输出5句 hello world
        print(5);
        // 输出10句 hello world
        print(10);
        // 输出15句 hello world
        print(15);
    }

    /**
     * 此方法用来输出 “hello world”
     */
    public static void print(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println("hello word");
        }
    }
}
