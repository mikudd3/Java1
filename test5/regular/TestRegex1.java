package com.lanqiao.javalearn.java1.test5.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project: 正则表达式的基本使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestRegex1 {
    /**
     * 正则表达式进行数据验证的操作
     *
     * @param regex 正则表达式
     * @param input 匹配的数据信息
     */
    public void method1(String regex, String input) {
        // 根据给定的正则表达式获取 Pattern 类对象
        Pattern p = Pattern.compile(regex);

        // 通过 Pattern 类中的 matcher() 方法获取 Matcher 类对象
        Matcher m = p.matcher(input);

        // 当输入字符串中的内容完全匹配，则打印输出
        if (m.matches()) {
            System.out.println(m.group());
        } else {
            // 当输入的字符串只能部分匹配时，则一部分一部分打印输出
            while (m.find()) {
                System.out.println(m.group() + "   start index: " + m.start() + "   end index: " + m.end());
            }
        }
    }

    /*
     * 通过正则表达式完成搜索和替换
     */
    public void method2() {
        // 提供字符串，将字符串中的子串java，奇数为小写，偶数为大写
        String s = "Java jAva test java JAVa JaVa hello low JavA JAVA CoCo";
        // flags 标记位设置为 Pattern.CASE_INSENSITIVE，表示匹配 java 时忽略大小写。
        Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        // 将字符串根据模式进行匹配
        Matcher m = p.matcher(s);
        // 创建字符串缓冲区
        StringBuffer buffer = new StringBuffer();

        int i = 0;
        while (m.find()) {
            i++;
            // 将找到的 java 字符串进行替换
            m.appendReplacement(buffer, i % 2 == 0 ? "JAVA" : "java");
        }
        // 将数据追加放入字符串缓冲区中
        m.appendTail(buffer);
        // 将字符串缓冲区打印输出
        System.out.println(buffer);
    }

    public static void main(String[] args) {
        var tr = new TestRegex1();
        tr.method1("[1-9][0-9]{0,2}\\.\\d{1,3}\\.\\p{Digit}{1,3}\\.\\d{1,3}", "ip:192.168.9.12,127.0.0.1");
        tr.method1("[a-z]{2}:([1-9][0-9]{0,2}\\.\\d{1,3}\\.\\p{Digit}{1,3}\\.\\d{1,3},?)+", "ip:192.168.9.12,127.0.0.1");
        tr.method2();
    }
}
