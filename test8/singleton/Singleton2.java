package com.lanqiao.javalearn.java1.test8.singleton;
/*
* 单例模式实现方式二：饿汉式。
* */
public class Singleton2 {
    // 私有的静态的最终的的引用类型的对象
    private static final Singleton2 s = new Singleton2();

    // 私有构造器
    private Singleton2(){

    }

    // 公共的静态的可返回该类的实例
    public static Singleton2 getInstance(){
        return s;
    }

}
