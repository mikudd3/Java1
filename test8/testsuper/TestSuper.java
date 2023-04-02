package com.lanqiao.javalearn.java1.test8.testsuper;

import java.sql.Date;

/**
 * @project: super关键字使用测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestSuper {
    public static void main(String[] args) {
        // 根据不同的构造器，创建父类和子类对象
        var p1 = new Person();
        System.out.println(p1.getInfo());
        var p2 = new Person("王一", "男", Date.valueOf("1999-05-13"));
        System.out.println(p2.getInfo());
        var p3 = new Person("王二");
        System.out.println(p3.getInfo());
        var p4 = new Person("王三", "女");
        System.out.println(p4.getInfo());
        System.out.println("--------------------");

        var s1 = new Student();
        System.out.println(s1.getInfo());
        var s2 = new Student("赵一", "女", Date.valueOf("1998-12-30"), "复旦大学");
        System.out.println(s2.getInfo());
        var s3 = new Student("赵二", "男");
        System.out.println(s3.getInfo());
        var s4 = new Student("北京大学");
        System.out.println(s4.getInfo());
    }
}
