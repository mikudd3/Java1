package com.lanqiao.javalearn.java1.test8.teststatic;

/**
 * @project: static的使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStatic {

    //成员变量
    int i = 10;

    //静态变量、类变量
    static int j = 20;

    public static void main(String[] args) {
        System.out.println(j);
        var ts = new TestStatic();

        System.out.println(ts.i);
        // 创建不同的 TestStatic 对象进行变量访问
        var ts1 = new TestStatic();
        var ts2 = new TestStatic();

        System.out.println(ts1.i);
        System.out.println(ts1.j);
        System.out.println(ts2.i);
        System.out.println(ts2.j);
        // 不同的对象对 i 和 j 进行赋值

        ts1.i = 100;
        ts2.j = 200;
        // 打印不同对象的 i 和 j 变量

        System.out.println(ts1.i);
        System.out.println(ts1.j);
        System.out.println(ts2.i);
        System.out.println(ts2.j);

        System.out.println("----");
        System.out.println(j);
        System.out.println(ts.i);
    }
}
