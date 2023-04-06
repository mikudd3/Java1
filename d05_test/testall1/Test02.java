package itheima.java1.d05_test.testall1;

import java.util.Scanner;

/**
 * @project: 减肥计划switch版
 * @author: mikudd3
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入星期数：");
        int week = input.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入错误，请重新输入！！");
                break;
        }
    }
}
