package com.lanqiao.javalearn.java1.test7.constructor;

/**
 * @project: 定义一个 Person 类
 * @author: mikudd3
 * @version: 1.0
 */
public class Person {
    private String name; // 姓名
    private boolean sex; // 性别
    private int age;     // 年龄

    /**
     * 定义两个参数的构造函数
     */
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public Person() {
    }

    /**
     * 说话
     */
    public void speak(String word) {
        System.out.println(name + "说:" + word);
    }

    public static void main(String[] args) {
        // 创建 Person 对象
        Person person = new Person(); // 调用系统提供的一个隐式无参的构造方法
        person.name = "小蓝";
        person.speak("english");
    }
}
