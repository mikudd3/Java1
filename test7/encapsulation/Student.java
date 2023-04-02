package com.lanqiao.javalearn.java1.test7.encapsulation;

/**
 * @project: 封装学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student {
    private String stuName;  //学生姓名
    private int stuAge;      //学生年龄

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        //如果年龄在合理范围内，则正常赋值
        if (stuAge > 0 && stuAge < 120) {
            this.stuAge = stuAge;
        } else {
            this.stuAge = 0;
        }
    }
}
