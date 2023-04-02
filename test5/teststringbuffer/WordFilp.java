package com.lanqiao.javalearn.java1.test5.teststringbuffer;

/**
 * 单词翻转的意思是通过一组英文单词，
 * *   程序运行结束后将这组英文单词中的每个单词顺序颠倒过来，并最终以字符串形式输出。
 * 例如：
 * 提供字符串数组：{"I", "Love", "You", "Daddy"}
 * 翻转后输出字符串：I evoL uoY yddaD
 *
 * @author mikudd3
 */
public class WordFilp {
    /**
     * 单词反转
     *
     * @param strs
     */
    public static void reverse(String[] strs) {
        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];

            StringBuffer sb = new StringBuffer(s);

            sb.reverse();

            strs[i] = sb.toString();

        }
    }

    /**
     * 打印输出
     *
     * @param strs
     */
    public static void print(String[] strs) {
        for (String s : strs) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {

        String[] strs = {"I", "Love", "You", "Daddy"};
        reverse(strs);
        print(strs);
    }
}
