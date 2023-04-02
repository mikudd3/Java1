package com.lanqiao.javalearn.java1.test8;

/**
 * @project: 继承初始化测试子类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student extends Person{
    {
        System.out.println("2");

    }

    public Student() {
        System.out.println("B");
    }
}
