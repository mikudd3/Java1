package com.lanqiao.javalearn.java1.test4.recursion;

/**
 * 定义一个实现递归的类
 *
 * @author mikudd3
 */
public class TestRecursive {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    /**
     * 求 1+2+...+n 和的方法
     */
    public static long sum(int n) {
        //判断条件，一旦满足就不再递归，逐层返回
        if (n == 1) {
            return 1;
        }

        long sum = sum(n - 1);
        // 递归调用，获取下一个被加数字（n-1）
        return n + sum;
    }

}