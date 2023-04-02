package com.lanqiao.javalearn.java1.test8.testoverride;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
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

    /**
     * 获取学生的基本信息
     *
     * @return 姓名+性别+生日+学校的字符串信息
     */
    @Override
    public String getInfo() {
        return getName() + "   " + getSex() + "   " + getBirthday() + "   " + getSchool();
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}
