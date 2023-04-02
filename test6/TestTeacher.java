package com.lanqiao.javalearn.java1.test6;

/**
 * @project: 教师类测试
 * @author: mikudd3
 * @date: 22/3/2023 下午10:53
 * @version: 1.0
 */
public class TestTeacher {
    public static void main(String[] args) {
        var tc = new Teacher1();
        tc.name = "mikudd3";
        tc.age = 30;
        tc.sex = '男';
        tc.salary = 10000;
        tc.isProfessor = true;
        System.out.println(tc.toString());
    }
}
