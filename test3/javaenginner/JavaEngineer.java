package com.lanqiao.javalearn.java1.test3.javaenginner;

/**
 * java工程师初步实现
 * @author mikudd3
 */

import java.util.Scanner;

public class JavaEngineer {
    public static void main(String[] args) {
        double engSalary = 0;//工程师月薪
        int baseSalary = 0;//底薪
        int goalResult = 100;//月工作完成分数，0为最低，100最高
        int workDay = 22;//月工作天数
        double insurance = 3000 * 0.105;//保险
        //输入数据
        Scanner input = new Scanner(System.in);
        int userChoose = -1;//用户选择
        boolean flag = true;//循环标志
        while (flag) {
            //界面
            System.out.println("---------------------------");
            System.out.println("蓝桥Java工程师管理系统");
            System.out.println("---------------------------");
            System.out.println("1.1Java工程师资料");
            System.out.println("2.删除指定Java工程师资料");
            System.out.println("3.查询Java工程师资料");
            System.out.println("4.修改java工程师资料");
            System.out.println("5.计算Java工程师月薪");
            System.out.println("6.保存新添加的工程师资料");
            System.out.println("7.对Java工程师信息进行排序(1编号升序，2姓名降序)");
            System.out.println("8.输出所有Java工程师信息");
            System.out.println("9.清空所有Java工程师数据");
            System.out.println("10.打印Java工程师数据报表");
            System.out.println("11.从文件重新导入Java工程师数据");
            System.out.println("0.结束");
            System.out.println("---------------------------");
            System.out.println("请输入你的选择：");
            userChoose = input.nextInt();
            switch (userChoose) {
                case 1:
                    System.out.println("该功能未完善");
                    break;
                case 2:
                    System.out.println("该功能未完善");
                    break;
                case 3:
                    System.out.println("该功能未完善");
                    break;
                case 4:
                    System.out.println("该功能未完善");
                    break;
                case 5: {
                    System.out.println("请输入基本底薪");
                    baseSalary = input.nextInt();
                    System.out.println("请输入月工作分数，0最小，100最大");
                    goalResult = input.nextInt();
                    System.out.println("请输入工作天数");
                    workDay = input.nextInt();
                    System.out.println("请输入所交保险");
                    insurance = input.nextDouble();
                    //计算月薪
                    engSalary = baseSalary + baseSalary * 0.25 * goalResult / 100 + 15 * workDay - insurance;
                    System.out.println("Java月薪" + engSalary);
                }
                    break;
                case 6:
                    System.out.println("该功能未完善");
                    break;
                case 7:
                    System.out.println("该功能未完善");
                    break;
                case 8:
                    System.out.println("该功能未完善");
                    break;
                case 9:
                    System.out.println("该功能未完善");
                    break;
                case 10:
                    System.out.println("该功能未完善");
                    break;
                case 11:
                    System.out.println("该功能未完善");
                    break;
                case 0:
                    System.out.println("欢迎下次使用！！！");
                    flag = false;
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }
    }
}
