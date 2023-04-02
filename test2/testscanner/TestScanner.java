package com.lanqiao.javalearn.java1.test2.testscanner;

// 需要导入，才能使用 Scanner 类

import java.util.Scanner;

/**
 * Scanner 的简单使用
 *
 * @author mikudd3
 */
public class TestScanner {
    public static void main(String[] args) {
        //创建控制台输入对象
        Scanner input = new Scanner(System.in);

        //从控制台输入byte类型数据
        byte byteNum = input.nextByte();
        System.out.println("byteNum：" + byteNum);

        //从控制台输入short类型
        short shortNum = input.nextShort();
        System.out.println("shortNum：" + shortNum);

        //从控制台输入 int 类型的数据
        int intNum = input.nextInt();
        System.out.println("intNum：" + intNum);

        //从控制台输入 long 类型的数据

        long longNum = input.nextLong();
        System.out.println("longNum：" + longNum);

        //从控制台输入 float 类型的数据
        float floatNum = input.nextFloat();
        System.out.println("floatNum：" + floatNum);

        //从控制台输入 double 类型的数据
        double doubleNum = input.nextDouble();
        System.out.println("doubleNum：" + doubleNum);

        //从控制台输入 boolean 类型的数据
        boolean booleanValue = input.nextBoolean();
        System.out.println("booleanValue：" + booleanValue);

        //从控制台输入 String 类型的数据
        String stringValue = input.next();
        System.out.println("stringValue：" + stringValue);

        // 资源释放
        input.close();

    }
}
