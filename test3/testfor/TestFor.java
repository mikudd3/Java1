package com.lanqiao.javalearn.java1.test3.testfor;

/**
 * project 输出1~1000之间的奇数和
 * @author mikudd3
 */
public class TestFor {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <= 1000;i += 2){
            sum += i;
        }

        System.out.println("1 ~ 1000之阿的奇数和为：" + sum);
    }
}
