package com.lanqiao.javalearn.java1.test6.testmethod;

import java.util.Scanner;

/**
 * @project: 学生管理系统
 * @author: mikudd3
 * @version: 1.0
 */
public class StudentProject {
    public static void main(String[] args) {
        while (true) {
            print();
            int choose = showMenu();
            switch (choose) {
                case 1:
                    addData();
                    break;
                case 2:
                    deleteData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    selectOneData();
                    break;
                case 5:
                    selectAllData();
                    break;
                case 6:
                    System.out.println("退出程序");
                    System.exit(0);

                default:
                    System.out.println("没有这个选项");
                    continue;
            }
        }
    }


    public static void print() {
        System.out.println("*****************");
        System.out.println("****学生管理系统***");
        System.out.println("*****************");
    }

    public static int showMenu() {
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

    public static void addData() {
    }

    public static void deleteData() {
    }

    public static void updateData() {
    }

    public static void selectOneData() {
    }

    public static void selectAllData() {
    }

}
