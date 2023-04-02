package com.lanqiao.javalearn.java1.test3.testwhile;

import java.util.Scanner;

/**
 * project 密码的正确匹配
 * @author mikudd3
 */
public class TestWhile {
    public static void main(String[] args) {
        String uerPass = "";
        String PASSWORD  = "123456";

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("请输入程序密码：");
            uerPass = input.nextLine();
            System.out.println();
        }while(!PASSWORD.equals(uerPass));

        System.out.println("密码正确，继续执行");
    }

}
