package com.lanqiao.javalearn.java1.test9.email;

import java.util.Scanner;

public class EmailWriter {
    public static void writerEmail(EmailInterface email) {

        //输入
        Scanner input = new Scanner(System.in);

        System.out.println("请输入发信者邮箱：");
        email.setSendAdd(input.next());

        System.out.println("请输入收信者邮箱：");
        email.setReceiveAdd(input.next());

        System.out.println("请输入邮件主题：");
        email.setEmailTitle(input.next());

        System.out.println("请输入邮件内容：");
        email.writeEmail(input.next());
    }
}
