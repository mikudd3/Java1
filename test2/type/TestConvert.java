package com.lanqiao.javalearn.java1.test2.type;

/**
 * 8 种简单类型之间的自动转换
 *
 * @author mikudd3
 */
public class TestConvert {
    public static void main(String[] args) {
        //声明byte类型变量
        byte b = 123;
        System.out.println("b 的值为" + b);
        // 将 byte 类型变量 b 赋值给 short 类型变量 s
        short s = b;
        System.out.println("s 的值为" + s);

        // 将 short 类型变量 s 赋值给 int 类型变量 i
        int i = s;
        System.out.println("i 的值为" + i);

        // 将 int 类型变量 i 赋值给 long 类型变量 ll
        long ll = i;
        System.out.println("ll 的值为" + ll);

        // 声明 char 类型变量 c
        char c = 'A';
        System.out.println("c 的值为" + c);

        // 将 char 类型变量 c 赋值给 int 类型变量 i2
        int i2 = c;
        System.out.println("i2 的值为" + i2);

        // 将 int 类型变量 i2 赋值给 float 类型变量 f，可能会损失精度
        float f = i2;
        System.out.println("f 的值为" + f);

        // 将 float 类型变量 f 赋值给 double 类型变量 d
        double d = i2;
        System.out.println("d 的值为" + d);

        // 将 long 类型变量 ll 赋值给 double 类型变量 d2,可能会损失精度
        double d2 = ll;
        System.out.println("d2 的值为" + d2);
    }
}
