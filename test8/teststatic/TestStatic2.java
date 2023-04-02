package com.lanqiao.javalearn.java1.test8.teststatic;

/**
 * @project: static修饰成员方法
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStatic2 {
    int i = 10;
    static int j = 20;

    /**
     * 静态方法中不能访问外部非静态的成员
     */
    public static void method1() {
        // i = 1000;
        j = 2000;
        // method2();
        // static int k = 40;
        int h = 40;
    }

    /**
     * 非静态方法中可以访问外部静态和非静态的成员
     */
    public void method2() {
        i = 150;
        j = 231;
        method1();
    }

    public static void main(String[] args) {
        TestStatic2.method1();
        new TestStatic2().method2();
    }
}
