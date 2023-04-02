package com.lanqiao.javalearn.java1.test8.teststatic;

/**
 * @project: static 关键字修饰语句块的使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStatic3 {
    // 类加载时只执行一次
    static {
        System.out.println("静态块");
    }

    // 每次创建对象时都会被加载
    {
        System.out.println("初始化块");
    }

    public static void main(String[] args) {
        new TestStatic3();
        new TestStatic3();
    }
}
