package com.lanqiao.javalearn.java1.test9.enumclass;

import java.time.LocalDate;
import java.time.Month;

public class TestEnum {
    public void methodMonth() {
        LocalDate date = LocalDate.now();
        Month month = date.getMonth();
        System.out.println("序号 = " + month.getValue() + ", 名称 = " + month.name());
    }

    public void methodSeasonsAll() {
        SeasonsAll spring = SeasonsAll.SPRING;
        System.out.println(spring);
        System.out.println("序号 = " + spring.getValue() + ", 名称 = " + spring.getName());
        SeasonsAll summer = SeasonsAll.SUMMER;
        System.out.println(summer);
        System.out.println("序号 = " + summer.getValue() + ", 名称 = " + summer.getName());
        SeasonsAll autum = SeasonsAll.AUTUMN;
        System.out.println(autum);
        System.out.println("序号 = " + autum.getValue() + ", 名称 = " + autum.getName());
        SeasonsAll winter = SeasonsAll.WINTER;
        System.out.println(winter);
        System.out.println("序号 = " + winter.getValue() + ", 名称 = " + winter.getName());
    }

    public static void main(String[] args) {
        TestEnum te = new TestEnum();
        //te.methodMonth();
        te.methodSeasonsAll();
    }


}

enum SeasonsAll {
    SPRING(1, "春天"), SUMMER(2, "夏天"), AUTUMN(3, "秋天"), WINTER(4, "冬天");

    // 声明序号
    private int value;
    // 声明名称
    private String name;

    // 声明构造方法
    private SeasonsAll(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // 获取序号信息
    public int getValue() {
        return value;
    }

    // 获取名称信息
    public String getName() {
        return name;
    }
}
