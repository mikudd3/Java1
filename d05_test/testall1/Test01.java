package itheima.java1.d05_test.testall1;

import java.util.Scanner;

/**
 * @project: 减肥计划if版
 * @author: mikudd3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入星期数：");
        int week = input.nextInt();

        if (week < 1 || week > 7) {
            System.out.println("输入错误，请重新输入！！");
        } else if (week == 1) {
            System.out.println("跑步");
        } else if (week == 2) {
            System.out.println("游泳");
        } else if (week == 3) {
            System.out.println("慢走");
        } else if (week == 4) {
            System.out.println("动感单车");
        } else if (week == 5) {
            System.out.println("拳击");
        } else if (week == 6) {
            System.out.println("爬山");
        } else {
            System.out.println("好好吃一顿");
        }
    }
}
