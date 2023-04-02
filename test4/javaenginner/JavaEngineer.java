package com.lanqiao.javalearn.java1.test4.javaenginner;

import java.util.Scanner;

/**
 * project 面向过程Java工程师
 * @author mikudd3
 */
public class JavaEngineer {
    static double avgSalary = 0.0;//java工程师月薪
    static int baseSalary = 3000;//底薪
    static int comResult = 100;//月工作完成分数，0最低，100最大
    static double workDay = 22;//月工作天数
    static double insurance = 3000 * 0.105;//月应扣保险数

    //从控制台获取输入对象
    static Scanner input = new Scanner(System.in);

    static int usrSel = -1;//用户选择数

    //main函数
    public static void main(String[] args) {
        while (true) {
            usrSel = showMenu();
            if (usrSel == 0)
                break;
        }
    }

    //主界面
    public static int showMenu() {
        //显示主界面
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
        //输入选择
        usrSel = input.nextInt();
        switch (usrSel) {
            case 1:
                inputEngineerInfo();
                break;
            case 2:
                deleteEngineerInf0();
                break;
            case 3:
                queryEngineerInf0();
                break;
            case 4:
                updateEngineerInf0();
                break;
            case 5:
                calAvgSalary();
                break;
            case 6:
                saveEngineerInf0();
                break;
            case 7:
                rankEngineerInf0();
                break;
            case 8:
                showEngineerInf0();
                break;
            case 9:
                emptyEngineerInf0();
                break;
            case 10:
                printEngineerInf0();
                break;
            case 11:
                importEngineerInf0();
                break;
            case 0:
                System.out.println("程序结束！！感谢你的使用！");
                break;
            default:
                System.out.println("输入错误，请重新输入！");
                break;
        }
        return usrSel;
    }

    //计算Java工程师月薪
    public static void calAvgSalary() {
        System.out.println("请输入Java工程师底薪");
        baseSalary = input.nextInt();
        System.out.println("请输入月完成分数，0最小，100最大");
        comResult = input.nextInt();
        System.out.println("请输入月工作天数");
        workDay = input.nextDouble();
        System.out.println("请输入应扣保险数");
        insurance = input.nextDouble();
        avgSalary = baseSalary + baseSalary * 0.25 * comResult / 100 + 15 * workDay - insurance;
        System.out.println("java工程师月薪为：" + avgSalary);
    }

    //输入Java工程师资料
    public static void inputEngineerInfo() {
        System.out.println("本模块功能未实现");
    }

    //删除指定Java工程师资料
    public static void deleteEngineerInf0() {
        System.out.println("本模块功能未实现");
    }

    //查询Java工程师资料
    public static void queryEngineerInf0() {
        System.out.println("本模块功能未实现");
    }

    //修改java工程师资料
    public static void updateEngineerInf0() {
        System.out.println("本模块功能未实现");
    }

    //保存新添加的工程师资料
    public static void saveEngineerInf0() {
        System.out.println("本模块功能未实现");
    }

    //对Java工程师信息进行排序(1编号升序，2姓名降序)
    public static void rankEngineerInf0() {
        System.out.println("本模块功能未实现");
    }

    //输出所有Java工程师信息
    public static void showEngineerInf0() {
        System.out.println("本模块功能未实现");
    }

    //清空所有Java工程师数据
    public static void emptyEngineerInf0() {
        System.out.println("本模块功能未实现");
    }

    //打印Java工程师数据报表
    public static void printEngineerInf0() {
        System.out.println("本模块功能未实现");
    }

    //从文件重新导入Java工程师数据
    public static void importEngineerInf0() {
        System.out.println("本模块功能未实现");
    }


}
