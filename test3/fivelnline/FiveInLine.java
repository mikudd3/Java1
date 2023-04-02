package com.lanqiao.javalearn.java1.test3.fivelnline;
/**
 * 不分胜负五子棋
 * @author mikudd3
 */

import java.util.Scanner;

//五子棋
public class FiveInLine {

    public static void main(String[] args) {

        //玩家A棋子
        String playerA = "🔴";

        //玩家B棋子
        String playerB = "🔵";

        //判断是否先手
        boolean initiative = true;

        //棋盘组件
        String boardCompent = "➕";

        //横坐标
        int horizontal = 0;

        //纵坐标
        int vertical = 0;

        //键盘录入
        Scanner input = new Scanner(System.in);

        System.out.print("请设置正方形棋盘的大小：");
        int size = input.nextInt();

        //玩家姓名
        String name = null;

        //使用死循环不停下棋
        while (true) {
            name = initiative ? "张三" : "李四";

            //显示棋盘
            System.out.println("  壹贰叁肆伍陆柒捌玖拾屲亗岌岄岪峘");
            for (int i = 1; i <= size; i++) {
                System.out.print(i + (i < 10 ? " " : ""));
                for (int j = 1; j <= size; j++) {
                    if (i == horizontal && j == vertical) {
                        //落子的位置  此处仅为演示落子功能
                        System.out.print(initiative ? playerA : playerB);
                    } else {
                        System.out.print(boardCompent);
                    }
                }
                System.out.println();
            }
            while (true) {
                System.out.print(name + "请输入落子的横坐标：");
                horizontal = input.nextInt();
                System.out.print(name + "请输入落子的纵坐标：");
                vertical = input.nextInt();
                if ((vertical <= 0 || vertical > size) || horizontal <= 0 || horizontal > size) {
                    System.out.println("落子不在棋盘中，请重新落子");
                    continue;
                }
                //切换先手轮流下棋
                initiative = !initiative;
                break;
            }
        }
    }
}
