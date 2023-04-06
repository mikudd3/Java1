package itheima.java1.d03_if_while_switch.testswitch;

import java.util.Scanner;

/**
 * @project: 春夏秋冬
 * @author: mikudd3
 * @version: 1.0
 */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入月份：");
        int month = input.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println(month + "月属于春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + "月属于夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + "月属于秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month + "月属于冬季");
                break;
            default:
                System.out.println("输入月份错误，请输入（1-12）");
                break;
        }
    }
}
