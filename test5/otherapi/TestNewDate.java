package com.lanqiao.javalearn.java1.test5.otherapi;

import java.time.*;

/**
 * 日期类的使用
 * @author mikudd3
 */

public class TestNewDate {

    public static void method() {

        //创建对象
        LocalDate ld = LocalDate.now();
        System.out.println("日期：" + ld);

        //getYear()	获取该日期的年份，返回 int 类型数据，例如：2021
        int year = ld.getYear();
        System.out.println("年份：" + year);

        //getMonth()	获取该日期的月份（英文），返回 Month 对象，例如：AUGUST
        Month month = ld.getMonth();
        System.out.println("月份：" + month);

        //getMonthValue()	获取该日期的月份（1 - 12），返回 int 类型数据，例如：8
        int valueMonth = ld.getMonthValue();
        System.out.println("这个月是" + valueMonth + "月份(数字):");

        //getDayOfMonth()	获取该日期的日数（1 - 31），返回 int 类型数据，例如：13
        int day = ld.getDayOfMonth();
        System.out.println("今天" + day + "号");

        //getDayOfWeek()	获取该日期的星期几（英文），返回 DayOfWeek 对象，例如：FRIDAY
        DayOfWeek week = ld.getDayOfWeek();
        System.out.println("今天星期：" + week);

        //lengthOfMonth()	获取该日期的所在月的天数，返回 int 类型数据，例如：31
        int lengthMonth = ld.lengthOfMonth();
        System.out.println(month + "月天数：" + lengthMonth);

        //lengthOfYear()	获取该日期的所在年的天数，返回 int 类型数据，例如：365
        int lengthYear = ld.lengthOfYear();
        System.out.println(year + "年一共有多少天：" + lengthYear);

        //isLeapYear()	判断该日期的年份是否为闰年，返回 boolean 类型数据。
        boolean flag = ld.isLeapYear();
        System.out.println(flag ? "今年是闰年" : "今年不是闰年");

        //还有 4 个进行日期比较的方法：equals、isBefore、isAfter、isEqual 返回的都是 boolean 类型值。
        String s = "2020-1-1";

        boolean b1 = ld.equals("2020-1-1");
        System.out.println(b1);

        boolean b2 = ld.isBefore(LocalDate.of(2020, 1, 1));
        System.out.println(b2);

        Boolean b3 = ld.isAfter(LocalDate.of(2222, 1, 1));
        System.out.println(b3);

        boolean b4 = ld.isEqual(LocalDate.of(2222, 1, 1));
        System.out.println(b4);

    }

    /**
     * 本地时间工具的使用
     */
    public void method2() {
        // 获取当前时间对象信息
        LocalTime time1 = LocalTime.now();
        // 输出时间对象信息，默认格式 HH:mm:ss.SSS
        System.out.println(time1);
        // 获取当前时间的小时
        System.out.println(time1.getHour());
        // 获取当前时间的分钟
        System.out.println(time1.getMinute());
        // 获取当前时间的秒
        System.out.println(time1.getSecond());
        // 获取当前时间的纳秒
        System.out.println(time1.getNano());

        // 通过指定时分秒，获取本地时间实例
        LocalTime time2 = LocalTime.of(20, 2, 56);
        System.out.println(time2);

        // 两个时间进行比较操作
        // 两个时间是否相等
        System.out.println(time1.equals(time2));
        // time1 时间是否在 time2 时间之前
        System.out.println(time1.isBefore(time2));
        // time1 时间是否在 time2 时间之后
        System.out.println(time1.isAfter(time2));

    }

    /**
     * 本地日期时间工具的使用
     */
    public void method3() {
        // 获取本地日期时间对象实例
        LocalDateTime datetime1 = LocalDateTime.now();
        System.out.println(datetime1);

        // 通过指定的年月日小时分钟秒，获取本地时间对象实例
        LocalDateTime datetime2 = LocalDateTime.of(2021, 4, 29, 9, 0, 23);
        System.out.println(datetime2);
        // 如果指定的秒为 0 时，系统会省略输出
        datetime2 = LocalDateTime.of(2021, 4, 29, 9, 0, 0);
        System.out.println(datetime2);
    }

    public static void main(String[] args) {
        var tnd = new TestNewDate();

        tnd.method();
        tnd.method2();
    }
}
