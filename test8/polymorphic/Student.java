package com.lanqiao.javalearn.java1.test8.polymorphic;

import java.util.Date;

/**
 * 学生基本信息类
 *
 * @author mikudd3
 */
public class Student extends Person {
    // 学校
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student() {

    }

    public Student(String name, String sex, Date birthday, String school) {
        super(name, sex, birthday);
        this.school = school;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo() + "  " + getSchool();
    }


}
