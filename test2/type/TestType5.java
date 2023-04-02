package com.lanqiao.javalearn.java1.test2.type;

/**
 * 简单类型 - 字符类型的使用
 *
 * @author mikudd3
 */
public class TestType5 {
    public static void main(String[] args) {
        // 声明字符类型
        // 单引号中只能放入一个字符、一个数字或者一个中文字
        char c1 = 'A';
        char c2 = '1';
        char c3 = '好';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        // 字符类型变量可以用 Unicode 编码进行赋值
        char c4 = '\u0061';
        System.out.println(c4);
        // 字符类型变量也可以用转义符进行赋值
        char c5 = '\n';
        System.out.println(c5);
    }
}

