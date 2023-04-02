package com.lanqiao.javalearn.java1.test8.testextends;

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

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return super.getInfo() + "  " + getSchool();
    }


}
