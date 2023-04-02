package com.lanqiao.javalearn.java1.test6.testmethod;

import java.util.Scanner;

/**
 * @project: 模块化程序界面
 * @author: mikudd3
 * @version: 1.0
 */
public class TestMethod1 {

    /**
     * 该方法显示程序主界面，返回用户输入的功能菜单数
     */
    public static int showMenu() {
        System.out.println("1. 输入数据");
        System.out.println("2. 输出数据");
        System.out.println("3. 退出程序");
        System.out.print("请选择你的输入（只能输入1、2、3）：");
        Scanner input = new Scanner(System.in);//从控制台获取用户输入的选择
        return input.nextInt();
    }

    /**
     * 该方法执行模块1，完成输入数据的功能
     */
    public static void inputData() {
        System.out.println("执行1.输入数据模块");
        System.out.println("******************");
        System.out.println("******************");
    }

    /**
     * 该方法执行模块2，完成输出数据的功能
     */
    public static void outputData() {
        System.out.println("执行2.输出数据模块");
        System.out.println("******************");
        System.out.println("******************");
    }

    /**
     * main方法，程序的入口
     */
    public static void main(String[] args) {
        //依然使用的死循环保证程序不间断执行
        while (true) {
            //调用showMenu()方法获得用户输入
            int userSel = showMenu();

            switch (userSel) {
                case 1:
                    //调用inputData()方法
                    inputData();
                    break;
                case 2:
                    //调用outputData()方法
                    outputData();
                    break;
                case 3:
                    System.out.println("结束程序！");
                    break;
                default:
                    System.out.println("输入数据不正确！");
                    break;
            }

            //当用户输入3时，退出while循环，结束程序
            if (userSel == 3) {
                break;
            }
        }
    }
}
