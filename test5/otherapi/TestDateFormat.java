package com.lanqiao.javalearn.java1.test5.otherapi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * project 日期格式化操作
 *
 * @author mikudd3
 */
public class TestDateFormat {
    /**
     * 采用 DateFormat 进行格式处理
     */
    public static void method() {
        //获取DataFormat对象
        DateFormat df = DateFormat.getDateInstance();
        //调用 format 方法完成格式化处理
        String str = df.format(new Date());
        System.out.println(str);    //2023年3月14日

        // 获取 DateFormat 对象，格式化日期和时间，按默认格式
        df = DateFormat.getDateTimeInstance();
        str = df.format(new Date());
        System.out.println(str);    //2023年3月14日 下午4:37:52

        //// 获取 DateFormat 对象，格式化日期和时间，日期按长型格式，时间按短型格式
        df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
        str = df.format(new Date());
        System.out.println(str);        //2023年3月14日 下午4:40
    }

    /**
     * 采用 SimpleDateFormat 进行日期格式化操作
     */
    public void method2() {
        // 创建日期对象 d
        Date d = new Date();
        // 创建日期格式化对象 sdf，格式要求 yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));

        // 格式中 E 指的是星期名
        sdf = new SimpleDateFormat("yyyy/MM/dd E");
        System.out.println(sdf.format(d));

        // SSS 一般毫秒数用 3 个 S 标识 ，a - 上下午的标识
        sdf = new SimpleDateFormat("hh:mm:ss.SSS a");
        System.out.println(sdf.format(d));
    }

        public static void main (String[]args){

            var tdf = new TestDateFormat();

            tdf.method();
            tdf.method2();


        }
    }
