package com.lanqiao.javalearn.java1.test5.otherapi;

import java.util.Date;

/**
 * @project: 日期工具类的基本使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestDate {
    public static void main(String[] args) {

        //创建日期对象
        var d = new Date();

        // 按世界标准时间输出
        System.out.println(d);

        // 返回此日期对象表示的自1970年1月1日00:00:00 以来的毫秒数。
        System.out.println(d.getTime());
    }
}
