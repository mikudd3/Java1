package com.lanqiao.javalearn.java1.test5.regular;

import java.util.StringTokenizer;

/**
 * @project: 字符串的匹配、查找、替换和分割
 * @author: mikudd3
 * @version: 1.0
 */
public class TestRegex2 {
    /**
     * matches()、split()、replaceFirst() 和 replaceAll() 使用
     */
    public void method1() {
        String str = "abcdeeeabcefg";
        //字符串匹配
        System.out.println(str.matches("(abc.*)+"));
        System.out.println(str.matches("(abce.*)+"));

        // 字符串替换
        System.out.println(str.replaceFirst("abc", "小桃子"));
        System.out.println(str.replaceAll("ab.{2}", "企鹅"));

        // 字符串分割
        String str2 = "hello|你好|123|test|java";
        // String[] ss = s.split("\\s*\\|\\s*");
        String[] ss = str2.split("\\|");
        for (String s : ss) {
            System.out.println(s);
        }

        str2 = "hello,你好,123,test,java";
        ss = str2.split(",");
        for (String s : ss) {
            System.out.println(s);
        }
    }

    /**
     * StringTokenizer
     */
    public void method2() {
        // 默认分割符
        StringTokenizer st = new StringTokenizer("this is a string");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        // 指定分隔符
        st = new StringTokenizer("this|is|a|string", "|");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        st = new StringTokenizer("this,is,a,string", ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    public static void main(String[] args) {
        var tr = new TestRegex2();
        tr.method1();
        tr.method2();
    }
}
