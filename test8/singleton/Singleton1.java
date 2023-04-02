package com.lanqiao.javalearn.java1.test8.singleton;

/**
 * 单例模式实现方式一:懒汉式。
 *
 * @author mikudd3
 */
public class Singleton1 {
    //私有的静态的引用类型变量
    private static Singleton1 s;

    //私有的构造器
    private Singleton1() {

    }

    //公有的静态的可返回该类的实例
    public static Singleton1 getInstance() {
        if (s == null) {
            s = new Singleton1();
        }

        return s;
    }
}
