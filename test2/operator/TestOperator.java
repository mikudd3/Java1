package com.lanqiao.javalearn.java1.test2.operator;

/**
 * 算术运算符的使用
 *
 * @author mikudd3
 */
public class TestOperator {
    public static void main(String[] args) {
        //由于算术运算符比较简单，我们就直接放在输出语句中来看一下运行结果。
        System.out.println(2 + 2);
        System.out.println(15 - 3);
        System.out.println(6 * 22);
        System.out.println(15 / 2);
        System.out.println(15 % 2);

        int a = 2;
        int b = (++a) * 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 2;
        int d = (c++) * 5;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
