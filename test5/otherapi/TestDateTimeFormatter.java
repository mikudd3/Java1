package com.lanqiao.javalearn.java1.test5.otherapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 本地日期时间与字符串之间互转
 *
 * @author 小桃子
 */
public class TestDateTimeFormatter {
    /**
     * 本地日期时间转字符串输出
     */
    public void method1() {
        // 获取当前日期对象
        LocalDate date = LocalDate.now();
        // 将日期对象转换为字符串
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(s1);

        // 自定义输出的日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String s2 = date.format(formatter);
        System.out.println(s2);

        // 获取当前日期时间对象
        LocalDateTime datetime = LocalDateTime.now();
        // 将日期时间对象转换为字符串输出
        System.out.println(datetime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        // 将日期时间对象按自定义格式转换为字符串输出
        System.out.println(datetime.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒")));
    }

    /**
     * 字符串转本地日期时间输出
     */
    public void method2() {
        // 将字符串转换为本地日期
        String s1 = "20201224";
        LocalDate date = LocalDate.parse(s1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date);
        // 当字符串的格式和本地日期默认格式相同时，可以不需要添加模板样式
        String s2 = "2020-12-24";
        date = LocalDate.parse(s2);
        System.out.println(date);
        // 将字符串转化为本地时间
        String s3 = "09:33:06";
        LocalTime time = LocalTime.parse(s3, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(time);
        // 将字符串转换为本地日期和时间
        String s4 = "2021年08月13日 02时16分15秒";
        // 当给定的模板样式不能满足你的需求时，可以自定义样式，进行转换操作
        LocalDateTime datetime = LocalDateTime.parse(s4, DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒"));
        System.out.println(datetime);
    }

    public static void main(String[] args) {
        var tdtf = new TestDateTimeFormatter();
        tdtf.method1();
        tdtf.method2();
    }
}
