package com.lanqiao.javalearn.java1.test2.operator;

/**
 * 位运算符的使用
 *
 * @author mikudd3
 */
public class TestOperator6 {
    public static void main(String[] args) {
        // 按位取反
        int a = 10;
        int b = ~a;
        System.out.println(b);
        // 声明两个整型变量
        int x = 1, y = 2;
        // 按位与
        int c = x & y;
        System.out.println(c);
        // 按位或
        int d = x | y;
        System.out.println(d);
        // 按位异或
        int e = x ^ y;
        System.out.println(e);
    }
}
