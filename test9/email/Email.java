package com.lanqiao.javalearn.java1.test9.email;

public class Email implements EmailInterface,PortInterface {
    String sendAdd = "";               //发信者邮箱
    String receiveAdd = "";            //收信者邮箱
    String emailTitle = "";            //邮件主题
    String email = "";                 //邮件内容
    int sendPort = 25;                 //添加端口属性
    int receivePort = 110;             //发送端端口号

    //实现设置发信者邮箱
    public void setSendAdd(String add) {
        this.sendAdd = add;
    }

    //实现设置收信者邮箱
    public void setReceiveAdd(String add) {
        this.receiveAdd = add;
    }

    //实现设置邮件主题
    public void setEmailTitle(String title) {
        this.emailTitle = title;
    }

    //实现设置邮件内容
    public void writeEmail(String email) {
        this.email = email;
    }

    //实现设置发送端端口号
    @Override
    public void setSendPort(int port) {
        this.sendPort = port;

    }

    //实现设置接收端端口号
    @Override
    public void setReceivePort(int port) {
        this.receivePort = port;

    }

    //显示邮件全部信息
    public void showEmail() {
        System.out.println("***显示电子邮件内容***");
        System.out.println("发送端端口号：" + sendPort);
        System.out.println("接收端端口号：" + receivePort);
        System.out.println("发信者邮箱：" + sendAdd);
        System.out.println("收信者邮箱：" + receiveAdd);
        System.out.println("邮件主题：" + emailTitle);
        System.out.println("邮件内容：" + email);

    }
}
