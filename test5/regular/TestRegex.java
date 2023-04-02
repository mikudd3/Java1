package com.lanqiao.javalearn.java1.test5.regular;

public class TestRegex {
    public void method1() {
        String str = "abcdeeeabcefg";
        // 字符串匹配
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

    public static void main(String[] args) {
        TestRegex tr = new TestRegex();
        tr.method1();
    }
}
