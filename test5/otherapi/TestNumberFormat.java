package com.lanqiao.javalearn.java1.test5.otherapi;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 数值格式化处理的基本操作
 *
 * @author mikudd3
 */
public class TestNumberFormat {
    public static void method1() {

        double d = 3.1415926;


        //NumberFormat.getInstance()	数值默认格式化处理
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.format(d));

        //NumberFormat.getIntegerInstance()	数值按整型方式格式化处理
        nf = NumberFormat.getIntegerInstance();
        System.out.println(nf.format(d));

        //NumberFormat.getNumberInstance()	数值按数字方式格式化处理
        nf = NumberFormat.getNumberInstance();
        System.out.println(nf.format(d));

        //NumberFormat.getCurrencyInstance()	数值按货币方式格式化处理
        nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(d));

        //NumberFormat.getPercentInstance()	数值按百分比方式格式化处理
        nf = NumberFormat.getPercentInstance();
        System.out.println(nf.format(d));

    }

    public static void method2() {

        double d1 = 10.1;
        double d2 = 12.3;
        System.out.println(d1 + d2);

        double d3 = 1612.31;
        double d4 = 274.09;
        System.out.println(d3 + d4);

        float f1 = 1612.31f;
        float f2 = 274.09f;
        System.out.println(f1 + f2);

        System.out.printf("%.2f%n", d3 + d4);
        System.out.format("%.2f%n", d3 + d4);

        DecimalFormat df = new DecimalFormat("#########.00");

        System.out.println(df.format(d3 + d4));
        System.out.println(df.format(d1 + d2));

        df = new DecimalFormat("###,###,###.00");

        System.out.println(df.format(d3 + d4));
        System.out.println(df.format(d1 + d2));

    }

    public static void main(String[] args) {
        TestNumberFormat tnf = new TestNumberFormat();

        tnf.method1();
        tnf.method2();
    }
}
