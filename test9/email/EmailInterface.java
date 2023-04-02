package com.lanqiao.javalearn.java1.test9.email;

public interface EmailInterface {
    //设置发信者邮箱
    public void setSendAdd(String add);

    //设置收信者邮箱
    public void setReceiveAdd(String add);

    //设置邮件主题
    public void setEmailTitle(String title);

    //设置邮件内容
    public void writeEmail(String email);
}
