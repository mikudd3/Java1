package com.lanqiao.javalearn.java1.test2.task;

import java.util.Scanner;

/**
 * 编写JAVA程序，实现模拟幸运顾客购物免单功能。
 *  商场活动规则：购物结算时，如果客户的4位会员卡号的各个位上的数字的平均值等于5， 则该顾客当天购物免单。
 * 	接收用户输入的会员卡号，输出相应信息。
 * @author mikudd3
 */
public class Shop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入用户卡号(4位数)：");

        int num = input.nextInt();

        //各位求和
        int sum = 0;

        while(num != 0){
            sum += num % 10;
            num /= 10;
        }

        //平均值
        int avg = sum / 4;

        System.out.println(avg == 5 ? "恭喜你，你是幸运用户，你可以免单" : "很可惜，你不是幸运用户，不能免单");

        /*if(avg == 5){
            System.out.println("恭喜你，你是幸运用户，你可以免单");
        }else{
            System.out.println("很可惜，你不是幸运用户，不能免单");
        }*/

    }
}
