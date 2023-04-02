package com.lanqiao.javalearn.java1.test7.org;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student {
    String stuName;

    /**
     * 一个参数的构造方法
     */
    public Student(String name) {
        this.stuName = name;
    }

    /**
     * 访问权限为default
     */
    void showName() {
        System.out.println("学生姓名为：" + this.stuName);
    }
}
