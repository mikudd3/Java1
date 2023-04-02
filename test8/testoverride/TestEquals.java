package com.lanqiao.javalearn.java1.test8.testoverride;

import java.sql.Date;

/**
 * 重写equals方法测试
 *
 * @author mikudd3
 */
public class TestEquals {
    public static void main(String[] args) {
        Object obj1 = new Object();

        Object obj2 = new Object();

        System.out.println(obj1.equals(obj2));//false
        System.out.println(obj1 == obj2);//false

        String str1 = "hello";

        System.out.println(obj1.equals(str1));//false

        String str2 = new String("hello");

        System.out.println(str1 == str2);//false

        System.out.println(str1.equals(str2));//true

        // 创建 Person 对象进行比较
        Person p1 = new Person();
        p1.setName("Tom");
        p1.setSex("男");
        p1.setBirthday(Date.valueOf("1995-10-11"));
        System.out.println(p1);

        Person p2 = new Person();
        p2.setName("Tom");
        p2.setSex("男");
        p2.setBirthday(Date.valueOf("1995-10-11"));
        System.out.println(p2);

        // p1 和 p2 进行比较
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
