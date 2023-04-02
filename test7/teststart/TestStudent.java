package com.lanqiao.javalearn.java1.test7.teststart;

/**
 * @project: 测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        Student temp = new Student();
        System.out.println(temp.getName() + " 正在读大学" + temp.getGrade() + "年级");
        //构造方法初始化成员变量在初始化块执行之后
        Student wangYun = new Student("王云", 22, 1, 4);
        System.out.println(wangYun.getName() + " 正在读大学" + wangYun.getGrade() + "年级");
    }
}
