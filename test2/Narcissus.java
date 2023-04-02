package com.lanqiao.javalearn.java1.test2;

import java.util.Scanner;

/**
 * 判断水仙花数
 * @author mikudd3
 */
public class Narcissus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //完成在控制台输入一个三位数，判断该数是否为水仙花数。
        System.out.println("请输入一位三位整数：");
        int num = input.nextInt();

        int a = num % 10;       //个位
        int b = num / 10 % 10;  //十位
        int c = num / 10 / 10;  //百位
        int sum = a * a * a + b * b * b + c * c * c;    //和

        //判断是否为水仙花数
        //程序运行结束后，控制台输出的内容为：“N 是水仙花数” 或 “N 不是水仙花数” ，N 表示一个三位数。
        if(num == sum){
            System.out.println("“" + num + "是水仙花数”");
        }else {
            System.out.println("“" + num + "不是水仙花数”");
        }

    }
}
