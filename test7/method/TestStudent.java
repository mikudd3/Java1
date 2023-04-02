package com.lanqiao.javalearn.java1.test7.method;

/**
 * @project: 方法重载学生类测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student("小蓝", 22);
        stu.read("Java编程思想", "埃克尔", 108.0);
        stu.read("Java编程思想", "埃克尔");
        stu.read("Java编程思想", 108.0);
        stu.read();
    }
}
