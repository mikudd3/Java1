package com.lanqiao.javalearn.java1.test2.operator;

/**
 * 条件运算符的使用
 *
 * @author mikudd3
 */
public class TestOperator5 {
    public static void main(String[] args) {
        //声明两个整型变量
        int a = 10;
        int b = 20;

        // 当 a > b 条件成立，将 a 赋给 c，否则将 b 赋给 c
        int c = a > b ? a : b;
        System.out.println(c);

        // 声明一个成绩变量 d
        int d = 59;
        // 当成绩大于等于 60 ，考试通过，否则返回成绩
        String result = d >= 60 ? "PASS" : d + "";
        System.out.println(result);
    }
}
