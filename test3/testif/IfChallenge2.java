package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * 找出三个数中的最大值
 *
 * @author mikudd3
 */
public class IfChallenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = input.nextInt();

        System.out.println("请输入第二个数字：");
        int num2 = input.nextInt();

        System.out.println("请输入第三个数字：");
        int num3 = input.nextInt();

        //最大值
        int max = 0;

        if(num1 > num2){
            if(num1 > num3){
                max = num1;
            }else {
                max = num3;
            }
        }else{
            if(num2 > num3){
                max = num2;
            }else {
                max = num3;
            }
        }

        System.out.println("三个数中的最大值为：" + max);

    }
}
