package com.lanqiao.javalearn.java1.test9.email;

public class TestInterface2 {
    public static void main(String[] args) {

        //创建并实例化一个实现了电子邮件接口的对象email
        EmailInterface email = new Email();

        //调用EmailWriter类的静态方法writeEmail写邮件
        EmailWriter.writerEmail(email);

        //强制类型转换，调用Email类的showEmail()方法（不是接口方法）
        ((Email) email).showEmail();

    }
}
