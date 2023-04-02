package com.lanqiao.javalearn.java1.test4.recursion;

/**
 * 定义一个求 n 阶乘的类
 *
 * @author mikudd3
 */
public class TestMethod {
    /**
     * 求n的阶乘的方法
     */
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        //递归调用，计算n-1的阶乘
        long sum = factorial(n - 1);
        //逐层返回求阶乘
        return n * sum;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
