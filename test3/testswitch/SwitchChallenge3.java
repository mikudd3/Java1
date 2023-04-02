package com.lanqiao.javalearn.java1.test3.testswitch;

import java.util.Scanner;

/**
 * 每个月有多少天
 *
 * @author mikudd3
 */
public class SwitchChallenge3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入年份：");
        int year = input.nextInt();

        System.out.println("请输入月份：");
        int month = input.nextInt();

        //如果是闰年
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(month + "月是大月，有" + 31 + " 天");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(month + "月是小月，有" + 30 + " 天");
                    break;
                case 2:
                    System.out.println(year + "年是闰年，" + month + "月是闰月，有" + 29 + " 天");
                    break;
                default:
                    System.out.println("请输入正确的月份：");
                    break;
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(month + "月是大月，有" + 31 + " 天");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(month + "月是小月，有" + 30 + " 天");
                    break;
                case 2:
                    System.out.println(year + "年不是闰年，" + month + "月是平月，有" + 28 + " 天");
                    break;
                default:
                    System.out.println("请输入正确的月份：");
                    break;
            }
        }
    }
}
