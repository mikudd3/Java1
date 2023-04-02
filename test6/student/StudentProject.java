package com.lanqiao.javalearn.java1.test6.student;

import java.util.Scanner;

/**
 * @project: 学生管理系统
 * @author: mikudd3
 * @version: 1.0
 */
public class StudentProject {


    public void print() {
        System.out.println("*****************");
        System.out.println("****学生管理系统***");
        System.out.println("*****************");
    }

    public int showMenu() {
        System.out.println("1.添加学生信息");
        System.out.println("2.删除学生信息");
        System.out.println("3.修改学生信息");
        System.out.println("4.查询指定学生信息");
        System.out.println("5.查询所有学生信息");
        System.out.println("6.退出");
        System.out.println("*************");
        System.out.println("请输入你的选择");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        return choose;
    }

    public void addData() {
        System.out.println("执行添加学生信息");
    }

    public void deleteData() {
        System.out.println("执行删除学生信息");

    }

    public void updateData() {
        System.out.println("执行更新学生信息");

    }

    public void selectOneData() {
        System.out.println("执行查询学生信息");

    }

    public void selectAllData() {
        System.out.println("执行查询所有学生信息");

    }

}
