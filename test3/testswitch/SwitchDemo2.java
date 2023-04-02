package com.lanqiao.javalearn.java1.test3.testswitch;

import java.util.Scanner;

/**
 * case 穿透的使用
 *
 * @author mikudd3
 */
public class SwitchDemo2 {
    public static void main(String[] args) {

        //创建键盘输入对象
        Scanner input = new Scanner(System.in);
        //录入数据
        System.out.print("请输入月份(1-12)：");
        int month = input.nextInt();

        //原始方式太麻烦了，可以使用 case 穿透进行改进
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("开始第一季度（Q1）的统计工作");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("开始第二季度（Q2）的统计工作");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("开始第三季度（Q3）的统计工作");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("开始第四季度（Q4）的统计工作");
                break;
            default:
                System.out.println("输入的月份有误");
        }

    }
}

