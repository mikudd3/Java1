package com.lanqiao.javalearn.java1.test8.testsuper;

import java.util.Date;

/**
 * @project: super关键字的使用
 * @author: mikudd3
 * @version: 1.0
 */
public class Student extends Person {
    // 学校
    private String school;

    /**
     * 无参构造方法
     */
    public Student() {
        super("张三");
    }

    /**
     * 带全参构造方法
     *
     * @param name     姓名
     * @param sex      性别
     * @param birthday 出生日期
     * @param school   学校
     */
    public Student(String name, String sex, Date birthday, String school) {
        super(name, sex, birthday);
        this.school = school;
    }

    /**
     * 带部分参数构造方法
     *
     * @param name   姓名
     * @param sex    性别
     * @param school 学校
     */
    public Student(String name, String sex, String school) {
        this(name, sex, null, school);
    }

    /**
     * 带学校信息参数构造方法
     *
     * @param school 学校
     */
    public Student(String school) {
        this.school = school;
    }

    /**
     * 带部分参数构造方法
     *
     * @param name   姓名
     * @param school 学校
     */
    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取学生的基本信息
     *
     * @return 姓名+性别+生日+学校的字符串信息
     */
    public String getInfo() {
        return super.getInfo() + "   " + getSchool();
    }
}
