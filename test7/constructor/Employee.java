package com.lanqiao.javalearn.java1.test7.constructor;

/**
 * @project: 员工类
 * @author: mikudd3
 * @version: 1.0
 */
public class Employee {
    private String name;    // 姓名
    private int age;        // 年龄
    private double salary;  // 薪水

    /**
     * 无参构造方法
     */
    public Employee() {
        // 调用有参的构造参数，给对象赋值
        this("小蓝", 18, 6000);
    }

    /**
     * 有参构造方法
     */
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * 输出员工的基本信息
     */
    public void show() {
        System.out.println("姓名：" + name + "\t年龄：" + age + "\t薪水：" + salary);
    }
}
