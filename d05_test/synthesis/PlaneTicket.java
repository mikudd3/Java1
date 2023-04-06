package itheima.java1.d05_test.synthesis;

import java.util.Scanner;

/**
 * @project: 卖飞机票
 * 需求:
 * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
 * 按照如下规则计算机票价格:旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 * @author: mikudd3
 * @version: 1.0
 */
public class PlaneTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = input.nextDouble();
        System.out.println("请输入月份：");
        int month = input.nextInt();
        System.out.println("请输入头等舱或经济舱：");
        String str = input.next();

        switch (month) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                if (str.equals("头等舱")) {
                    System.out.println("你的票价为：" + (price * 0.9));
                } else {
                    System.out.println("你的票价为：" + (price * 0.85));
                }
                break;
            }
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4: {
                if (str.equals("头等舱")) {
                    System.out.println("你的票价为：" + (price * 0.7));
                } else {
                    System.out.println("你的票价为：" + (price * 0.65));
                }
                break;
            }
        }
    }
}
