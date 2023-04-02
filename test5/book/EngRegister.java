package com.lanqiao.javalearn.java1.test5.book;

import java.util.Scanner;

/**
 * java工程师注册功能
 * @author mikudd3
 */
public class EngRegister {
    public static boolean isCorrect(String name, String pwd1, String pwd2) {
        boolean flag = false;
        if (name.length() < 6 || pwd1.length() < 8) {
            System.out.println("输入错误，用户名长度不能小于6，密码长度不能小于8！");
        } else if (!pwd1.equals(pwd2)) {
            System.out.println("输入错误，两次输入密码不相同，请重新输入");
        } else {
            System.out.println("注册成功，感谢你的使用！！");
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        //输入
        Scanner input = new Scanner(System.in);
        String engName = "";//java工程师用户名
        String pwd1 = "";//第一次输入密码
        String pwd2 = "";//第二次输入密码
        boolean flag = false;//循环退出条件

        do {
            System.out.println("请输入用户名：");
            engName = input.nextLine();
            System.out.println("请输入密码：");
            pwd1 = input.nextLine();
            System.out.println("请再次输入密码：");
            pwd2 = input.nextLine();
            //判断两次密码是否相同
            flag = isCorrect(engName, pwd1, pwd2);
        } while (!flag);
    }
}
