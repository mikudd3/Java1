package com.lanqiao.javalearn.java1.test2.operator;

/**
 * 移位运算符的使用
 *
 * @author mikudd3
 */
public class TestOperator7 {
    public static void main(String[] args) {
        int a = 10;
        // 无符号右移，移动 3 位
        int b = a >>> 3;
        System.out.println(b);
        // 左移，移动 3 位
        //左移1位为 * 2，三位为 * 2^3
        int c = a << 3;
        System.out.println(c);
        // 右移，移动 32 位
        int d = a >> 32;
        System.out.println(d);
    }
}
