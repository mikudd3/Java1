package com.lanqiao.javalearn.java1.test6.student;

/**
 * @project: 学生管理系统测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStudentProject {
    public static void main(String[] args) {
        var sp = new StudentProject();
        while (true) {
            sp.print();
            int choose = sp.showMenu();
            switch (choose) {
                case 1:
                    sp.addData();
                    break;
                case 2:
                    sp.deleteData();
                    break;
                case 3:
                    sp.updateData();
                    break;
                case 4:
                    sp.selectOneData();
                    break;
                case 5:
                    sp.selectAllData();
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
}
