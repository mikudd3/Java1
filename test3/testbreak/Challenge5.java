package com.lanqiao.javalearn.java1.test3.testbreak;

/**
 * project:补充代码，使程序跳出循环
 * @author mikudd3
 */
public class Challenge5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {

                break;
            }
            System.out.println("好好学习，天天向上");
        }
        System.out.println("好好学习，天天向上");
    }
}

