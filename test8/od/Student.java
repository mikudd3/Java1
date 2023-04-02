package com.lanqiao.javalearn.java1.test8.od;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student extends Person {

    private String grade;

    public Student() {

    }

    public Student(String name, String phone, String grade) {
        super(name, phone);
        this.grade = grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Person{name=" + getName() + "，phone=" + getPhone() + ",grade=" + grade + "}";
    }
}
