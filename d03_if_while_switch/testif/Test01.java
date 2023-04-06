package itheima.java1.d03_if_while_switch.testif;

import java.util.Scanner;

/**
 * @project: 商品的价格
 * @author: mikudd3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入会员级别：");
        int vip = input.nextInt();

        double cost = 100;

        if (1 == vip) {
            cost *= 0.9;
        } else if (2 == vip) {
            cost *= 0.8;
        } else if (3 == vip) {
            cost *= 0.7;
        }

        System.out.println("商品价格为：" + cost);

    }
}
