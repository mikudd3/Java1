package com.lanqiao.javalearn.java1.test5.regular;

/**
 * project 必须使用提供的字符串 1 和字符串 2 完成分割处理。
 *     请根据上一个实验所学的知识正确选择分割的处理方式，并正确书写正则表达式。
 *     分割后的数据，请使用循环打印输出在控制台，可以参考「挑战运行效果」图中的输出效果。
 *     请务必按照提供的代码的基础上书写，以免挑战无法通过。
 * @author mikudd3
 */
public class StringRegex {
    public static void main(String[] args) {
        // 程序代码
        String str1 = "123+456*789-123/456%789";

        //匹配不是0-9的字符
        String[] s1 = str1.split("[^0-9]");
        for(String s : s1){
            System.out.println(s);
        }

        String str2 = "0 1 2 3 4 5 6 7 8 9";
        //匹配空格
        String[] s2 = str2.split(" ");

        for(String s : s2){
            System.out.println(s);
        }

    }
}
