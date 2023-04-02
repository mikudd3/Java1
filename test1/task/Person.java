package com.lanqiao.javalearn.java1.test1.task;

/**
 * 输出个人资料
 * @author mikudd3
 */
public class Person {
    public static void main(String[] args) {
        System.out.println("---------- 个人档案 ----------");
        System.out.println("|\t" + String.format("%-8s","姓名：苏健昌") + "\t\t\t|");
        System.out.println("|\t" + String.format("%-8s","年龄：20") + "\t\t\t\t|");
        System.out.println("|\t" + String.format("%-8s","手机号：12345678900") + "\t\t|");
        System.out.println("|\t" + String.format("%-8s","专业：信息与计算科学") + "\t\t|");
        System.out.println("|\t" + String.format("%-8s","兴趣爱好：看书，学习") + "\t\t|");
        System.out.println("----------------------------");

    }
}
