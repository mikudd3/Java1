package com.lanqiao.javalearn.java1.test7.teststart;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student {
    private String name = "";
    private int age = -1;
    private int sex = -1;
    private int grade = -1;

    //使用初始化块初始化
    {
        System.out.println("使用初始化块初始化");
        this.name = "雷静";
        this.age = 22;
        this.sex = 2;
        this.grade = 4;
    }

    /**
     * 无参构造方法
     */
    public Student() {
        System.out.println("使用无参构造函数初始化");
    }

    /**
     * 构造方法，用户初始化对象的成员变量
     *
     * @param name
     * @param age
     * @param sex
     * @param grade
     */
    public Student(String name, int age, int sex, int grade) {
        System.out.println("使用有参构造函数初始化");
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.grade = grade;
    }

    // 给成员变量添加 setter/getter 方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSex() {
        return sex;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
