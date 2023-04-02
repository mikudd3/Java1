package com.lanqiao.javalearn.java1.test7.testpackage;

import com.lanqiao.javalearn.java1.test7.queue.Queue;
import com.lanqiao.javalearn.java1.test7.stock.Stock;

/**
 * @project: 包的引用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestImport {
    public static void main(String[] args) {
        //方式1
        Stock s = new Stock();
        //方式2
        com.lanqiao.javalearn.java1.test7.queue.Queue q = new Queue();
    }
}
