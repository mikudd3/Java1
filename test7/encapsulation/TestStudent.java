package com.lanqiao.javalearn.java1.test7.encapsulation;

/**
 * @project: 定义一个学生测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        Student xiaolan = new Student();
        /* 如果将stuAge赋值负数，setStuAge()就会将stuAge设置为默认值0，防止出现安全问题。
        xiaolan.setStuAge(-10); */
        xiaolan.setStuAge(22); // 给年龄赋值
        xiaolan.setStuName("小蓝");
        int age = xiaolan.getStuAge();
        String name = xiaolan.getStuName();

        System.out.println("姓名：" + name + "\t年龄：" + age);
    }
}
