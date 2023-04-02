package com.lanqiao.javalearn.java1.test10;

import java.io.Serializable;

public class Engineer implements Serializable {
    private String engName;//姓名
    private String password;//密码
    private double avgSalary;//月薪
    private int baseSalary;//底薪
    private int engNum;//编号
    private int age;//年龄

    //无参构造
    public Engineer() {

    }

    //有参构造
    public Engineer(String engName, String password, double avgSalary, int baseSalary, int engNum, int age) {
        this.engName = engName;
        this.password = password;
        this.avgSalary = avgSalary;
        this.baseSalary = baseSalary;
        this.engNum = engNum;
        this.age = age;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getEngName() {
        return engName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAvgSalary(double avgSalary) {
        this.avgSalary = avgSalary;
    }

    public double getAvgSalary() {
        return avgSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getEngNum() {
        return engNum;
    }

    public void setEngNum(int engNUm) {
        this.engNum = engNUm;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = Math.min(age, 150);
        }

    }

    @Override
    public String toString() {
        return "姓名：" + engName + "  "
                + "密码：" + password + "  "
                + "月薪：" + avgSalary + "  "
                + "底薪：" + baseSalary + "  "
                + "编号：" + engNum + "  "
                + "年龄：" + age + "  ";
    }

}

