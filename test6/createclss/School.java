package com.lanqiao.javalearn.java1.test6.createclss;

/**
 * @project: 学校类
 * @author: mikudd3
 * @version: 1.0
 */
public class School {
    // 类的属性
    String name; // 学校名
    String address;// 学校地址
    String president; // 校长

    /**
     * 输出学校的信息
     */
    public void print() {
        System.out.println("学校名称：" + name + "，学校地址：" + address + "，校长：" + president);
    }
}

