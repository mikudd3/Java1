package com.lanqiao.javalearn.java1.test7.constructor;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student {
    private String stuName;  // 学生姓名
    private int stuAge;      // 学生年龄
    private int stuSex;      // 学生性别  1：男   0：女
    private int stuGrade;    // 学生年级

    /**
     * 构造方法，用户初始化对象的成员变量
     */
    public Student(String name, int age, int sex, int grade) {
        stuName = name;
        stuAge = age;
        stuSex = sex;
        stuGrade = grade;
    }

    /**
     * 打印学生的信息
     */
    public void show() {
        System.out.println("姓名：" + stuName + "\t性别：" + (stuSex == 1 ? "男" : "女")
                + "\t年龄：" + stuAge + "\t年级：" + stuGrade);
    }
}
