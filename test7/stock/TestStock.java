package com.lanqiao.javalearn.java1.test7.stock;

/**
 * @project: 股票测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStock {
    public static void main(String[] args) {
        var s = new Stock("ORCL","Oracle Corporation",35,36);

        System.out.println(s.getChangePercent());
    }
}
