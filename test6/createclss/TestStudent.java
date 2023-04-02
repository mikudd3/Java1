package com.lanqiao.javalearn.java1.test6.createclss;

/**
 * @project: 学生类测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        //创建学生对象 蓝云
        Student lanYun = new Student();

        //反问对象中的属性和方法
        lanYun.stuName = "mikudd3";
        lanYun.stuAge = 22;
        lanYun.stuSex = 1;            //1代表男，2代表女
        lanYun.stuGrade = 4;        //4代表大学四年级
        lanYun.learn();                //调用学生听课的方法
        System.out.println(lanYun.doHomework(22));//调用学生写作业的方法，输入值22代表现在是22点
    }
}

