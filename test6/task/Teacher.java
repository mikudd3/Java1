package com.lanqiao.javalearn.java1.test6.task;

/**
 * @project: 老师类
 * @author: mikudd3
 * @version: 1.0
 */
class Teacher {
    //老师姓名
    String name;
    //老师教授课程
    String scoreName = "HTML5";

    /**
     * 老师正在上课
     */
    public void teach(Student s) {
        //xx老师在教学生xx学xx课程
        System.out.println(this.name + "老师在教学生" + s.name + "学" + this.scoreName + "课程");
    }

    /**
     * 默认构造方法
     */
    public Teacher() {

    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String scoreName) {
        this(name);
        this.scoreName = scoreName;
    }

}
