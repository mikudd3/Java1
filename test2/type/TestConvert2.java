package com.lanqiao.javalearn.java1.test2.type;

/**
 * 简单类型之间的强制转换
 *
 * @author mikudd3
 */
public class TestConvert2 {
    public static void main(String[] args) {
        // 声明 int 类型变量 i3
        int i3 = 128;
        // 将 int 类型变量 i3 数值赋给 byte 类型变量 b2，从大到小，需要强制转换
        byte b2 = (byte) i3;
        short s2 = (short) i3;
        System.out.println("b2的值为" + b2);
        System.out.println("s2的值为" + s2);

        // 多个类型进行计算操作
        byte b = 123;
        short s = 1000;
        char c = 'Z';
        /*
        b2 = b + s + c;
        s2 = b + s + c;
        */
        i3 = b + s + c;
        System.out.println("b2的值为" + b2);
        System.out.println("s2的值为" + s2);
        System.out.println("i3的值为" + i3);

        double d = 3.14;
        float f = 17.0f;

        int i4 = (int) (b + s + c + d + f);
        System.out.println("i4的值为" + i4);

        double d2 = b + s + c + d + f;
        System.out.println("d2的值为" + d2);
    }
}