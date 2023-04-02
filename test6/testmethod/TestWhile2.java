package com.lanqiao.javalearn.java1.test6.testmethod;

import java.util.Scanner;

/**
 * @project: 循环界面创建
 * @author: mikudd3
 * @version: 1.0
 */
public class TestWhile2 {
    public static void main(String[] args) {
        int userSel = -1;
        //用户选择输入的参数
        //使用while(true)，在单个模块功能执行结束后，重新输出主界面，继续循环

        while (true) {
            System.out.println("1. 输入数据");
            System.out.println("2. 输出数据");
            System.out.println("3. 退出程序");
            System.out.print("请选择你的输入（只能输入1、2、3）：");
            Scanner input = new Scanner(System.in);
            userSel = input.nextInt();    //从控制台获取用户输入的选择

            switch (userSel) {
                case 1:
                    System.out.println("执行1.输入数据模块");
                    System.out.println("******************");
                    System.out.println("******************");
                    break;
                case 2:
                    System.out.println("执行2.输出数据模块");
                    System.out.println("******************");
                    System.out.println("******************");
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

