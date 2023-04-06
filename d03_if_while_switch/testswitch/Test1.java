package itheima.java1.d03_if_while_switch.testswitch;

import java.util.Scanner;

/**
 * @project: 工作日休息日
 * @author: mikudd3
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = input.nextInt();

        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
        }
    }
}
