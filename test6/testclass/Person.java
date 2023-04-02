package com.lanqiao.javalearn.java1.test6.testclass;

/**
 * @project: person类
 * @author: mikudd3
 * @version: 1.0
 */
public class Person {
    String name;    //姓名
    int age;        //年龄
    int sex;        //性别：1-男，0-女

    /**
     * 说话
     */
    public static void speak() {
        System.out.println("我会说话！！！");
    }

    /**
     * 走路
     */
    public static void tread() {
        System.out.println("我在行走！！！");
    }

    public static void main(String[] args) {
        speak();
        tread();
    }
}

