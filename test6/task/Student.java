package com.lanqiao.javalearn.java1.test6.task;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
 */
class Student {
    String name;

    /**
     * 学生正在学习
     */
    public void learn(Teacher t) {
        //xx同学在学xx老师教授的xx课程
        System.out.println(this.name + "同学在学" + t.name + "老师教授的" + t.scoreName + "课程");
    }

    /**
     * 默认构造方法
     */
    public Student() {

    }

    /**
     * 有参构造方法
     *
     * @param name
     */
    public Student(String name) {
        this.name = name;
    }
}

