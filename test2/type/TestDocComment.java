package com.lanqiao.javalearn.java1.test2.type;

/**
 * 文档注释测试类
 *
 * @author mikudd3
 * @version 1.0
 * 创建日期：2023-03-19
 */
public class TestDocComment {
    /**
     * 提供两个参数，进行加法计算。
     *
     * @param a 整型数据
     * @param b 整型数据
     * @return 两个参数的加法计算值
     */
    public int addCompute(int a, int b) {
        return a + b;
    }

    /**
     * 打印输出字符串 Hello, Comment 信息。
     */
    void method1() {
        System.out.println("Hello, Comment");
    }
}
