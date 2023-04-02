package com.lanqiao.javalearn.java1.test8.testextends;

import com.lanqiao.javalearn.java1.test8.testextends.Person;
import com.lanqiao.javalearn.java1.test8.testextends.Student;

/**
 * 类继承的测试类
 *
 * @author mikudd3
 */
public class TestExtends {
    public static void main(String[] args) {
        // 创建子类对象
        Student s = new Student();
        // 访问父类中的成员
        s.setName("小桃子");
        s.setSex("女");
        s.setBirthday(null);
        System.out.println(s.getInfo());

        // 访问子类中的成员
        s.setSchool("浙江大学");
        System.out.println(s.getInfo() + "   " + s.getSchool());

        Person p1 = new Person();
        System.out.println(p1);
        System.out.println(p1.toString());
    }
}