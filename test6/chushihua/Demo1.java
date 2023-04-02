package com.lanqiao.javalearn.java1.test6.chushihua;

/**
 * @project: 类初始化测试
 * @author: mikudd3
 * @version: 1.0
 */
public class Demo1 {
    //初始化块
    {
        System.out.println("初始化块1");
    }
    Demo2 d = new Demo2();

    public Demo1() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        var Demo1 = new Demo1();

    }
}
