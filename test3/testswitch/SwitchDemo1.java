package com.lanqiao.javalearn.java1.test3.testswitch;

import java.util.Scanner;

/**
 * switch 分支结构的使用
 *
 * @author mikudd3
 */

public class SwitchDemo1 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner input = new Scanner(System.in);
        System.out.print("请输入小蓝的名次：");
        // 定义变量接收从控制台输入的名次信息
        int place = input.nextInt();
        // 使用 switch 完成名次的比对，进入对应的分支

        switch (place) {
            case 1://如果输入的值是 1 则进入此分支
                System.out.println("恭喜获得冠军，奖品为最新款旗舰笔记本电脑一台");
                break;
            case 2:
                System.out.println("恭喜获得亚军，奖品为最新款旗舰手机一部");
                break;
            case 3:
                System.out.println("恭喜获得季军，奖品为固态移动硬盘一个");
                break;
            case 4:
                System.out.println("恭喜获得殿军，奖品为 U 盘一个");
                break;
            default:
                System.out.println("重在参与，下次加油");
                break;
        }
    }
}

