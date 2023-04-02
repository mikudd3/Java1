package com.lanqiao.javalearn.java1.test2.operator;

/**
 * 关系运算符的使用
 *
 * @author mikudd3
 */
public class TestOperator2 {
    public static void main(String[] args) {
        //定义变量
        int a = 4;
        int b = 5;
        if (a == b) {
            System.out.println("a 等于 b");
        }
        if (a != b) {
            System.out.println("a 不等于 b");
        }
        if (a > b) {
            System.out.println("a 大于 b");
        }
        if (a < b) {
            System.out.println("a 小于 b");
        }
        if (a >= b) {
            System.out.println("a 大于等于 b");
        }
        if (a <= b) {
            System.out.println("a 小于等于 b");
        }
    }
}
