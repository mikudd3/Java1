package com.lanqiao.javalearn.java1.test6;

/**
 * @project : 新建一个教师类Teacher，
 * 教师属性：姓名（String）、年龄（int）、性别（char）、月薪（double）、
 * 是否是教授（boolean）；
 * @author: mikudd3
 * @date: 22/3/2023 下午10:47
 * @version: 1.0
 */
public class Teacher1 {
    //姓名
    String name;
    //年龄
    int age;
    //性别
    char sex;
    //月薪
    double salary;
    //是否是教授
    boolean isProfessor;

    public Teacher1(String name, int age, char sex, double salary, boolean isProfessor) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.isProfessor = isProfessor;
    }

    public Teacher1() {

    }

    /**
     * 输出
     *
     * @return
     */
    @Override
    public String toString() {
        return "[name=" + this.name
                + ",age=" + this.age
                + ",sex=" + this.sex
                + ",salary=" + this.salary
                + ",isProfessor=" + this.isProfessor
                + "]";
    }
}

