package com.lanqiao.javalearn.java1.test6.variable;

/**
 * @project: 成员变量测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestVariable {
    public static int a = 3;
    public static int b = 6;

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        //方法内部，局部变量
        //int a=1;
        //int b=2;
        System.out.println("a=" + a + "\tb=" + b);
    }
}
