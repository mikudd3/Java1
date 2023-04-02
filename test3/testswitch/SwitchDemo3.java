package com.lanqiao.javalearn.java1.test3.testswitch;

import java.util.Scanner;

/**
 * switch 和 if 嵌套的使用
 *
 * @author mikudd3
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner input = new Scanner(System.in);
        System.out.print("请输入小蓝的年龄：");
        // 定义变量接收从控制台输入的年龄信息
        int age = input.nextInt();
        System.out.print("请输入星期几：");
        // 定义变量接收从控制台输入的星期几信息
        String day = input.next();

        switch (day) {
            case "一":
            case "三":
            case "五": {
                if (age >= 18) {
                    System.out.println("今天有比赛哦，别迟到");
                } else {
                    System.out.println("小蓝参加的是少年组比赛，今天不用比赛");
                }
                break;
            }
            case "二":
            case "四":
            case "六": {
                if (age >= 18) {
                    System.out.println("小蓝参加的是少年组比赛，今天不用比赛");
                } else {
                    System.out.println("今天有比赛哦，别迟到");
                }
                break;
            }
            case "日":
                System.out.println(" 今天休息，不用比赛");
                break;
            default:
                System.out.println("合法日期格式是(一，二，三，四，五，六，日)");
        }

    }
}

