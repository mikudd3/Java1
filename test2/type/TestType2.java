package com.lanqiao.javalearn.java1.test2.type;

/**
 * 简单类型 - 整型 4 种类型的使用
 *
 * @author mikudd3
 */
public class TestType2 {
    public static void main(String[] args) {
        // byte 类型取值范围 -128 ~ 127
        byte b1 = 127;
        System.out.println(b1);
        // 短整型
        short s1 = 12;
        System.out.println(s1);
        // 默认是十进制整型数值
        int i1 = 20;
        System.out.println(i1);
        // 八进制整型数值
        int i2 = 020;
        System.out.println(i2);
        // 十六进制整型数值
        int i3 = 0x20;
        System.out.println(i3);
        // 长整型
        long l1 = 1000;
        System.out.println(l1);
        long l2 = 1000000000000L;
        System.out.println(l2);
    }
}

