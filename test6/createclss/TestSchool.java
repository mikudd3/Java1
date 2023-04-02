package com.lanqiao.javalearn.java1.test6.createclss;

/**
 * @project: 学校类测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestSchool {
    public static void main(String args[]) {
        // 创建 School 对象
        School school = new School();

        school.name = "mikudd3学院";      // 添加学校名称
        school.president = "mikudd3";// 添加校长
        school.address = "白金";     // 添加地址

        school.print(); //输出书的信息
    }
}

