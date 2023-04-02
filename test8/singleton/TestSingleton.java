package com.lanqiao.javalearn.java1.test8.singleton;

/**
 * 单列模式创建
 *
 * @author mikudd3
 */
public class TestSingleton {
    public static void main(String[] args) {
        //Singleton1 s1 = new Singleton1();  不能直接创建对象

        var s1 = Singleton1.getInstance();
        var s2 = Singleton1.getInstance();

        System.out.println(s1);//com.lanqiao.javalearn.java1.test8.singleton.Singleton1@3b07d329
        System.out.println(s2);//com.lanqiao.javalearn.java1.test8.singleton.Singleton1@3b07d329

        System.out.println(s1 == s2);//true


        var s3 = Singleton2.getInstance();
        var s4 = Singleton2.getInstance();

        System.out.println(s3);//com.lanqiao.javalearn.java1.test8.singleton.Singleton2@404b9385
        System.out.println(s4);//com.lanqiao.javalearn.java1.test8.singleton.Singleton2@404b9385

        System.out.println(s3 == s4);//true


    }
}
