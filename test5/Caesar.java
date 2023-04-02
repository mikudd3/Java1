package com.lanqiao.javalearn.java1.test5;

import java.util.Scanner;

/**
 * 凯撒密码是一种替换加密的技术，明文中的所有字母都在字母表上向后（或向前）按照一个固定数目进行偏移后被替换成密文。
 * *       例如，当偏移量是 2 的时候，所有的字母 A 将被替换成 C，B 变成 D，以此类推，字符串 "Hello" 转换成密文后则为 "Jgnnq"。
 * *       这个加密方法是以罗马共和时期凯撒的名字命名的，当年凯撒曾用此方法与其将军们进行联系。
 *
 * @author mikudd3
 */

public class Caesar {

    /**
     * 方法需要传递两个参数，一个是要进行加密处理的字符串，另一个是字符移动的位数。
     *
     * @param str1
     * @param n
     * @return
     */
    public String process(String str1, int n) {

        //将字符串转为字符数组
        char[] chars = str1.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            //小写字母
            if (chars[i] >= ((int) 'a') && chars[i] <= ((int) 'z')) {
                //后移n位
                chars[i] += n;

                //当转移之后的的字符大于‘z'
                if (chars[i] > ((int) 'z')) {
                    chars[i] -= 26;
                }
            } else if (chars[i] >= ((int) 'A') && chars[i] <= ((int) 'Z')) {
                //后移n位
                chars[i] += n;

                //当转移之后的的字符大于‘z'
                if (chars[i] > (int) 'Z') {
                    chars[i] -= 26;
                }
            }


        }

        //toString是返回地址
        //valueOf()是用chars数组里面的值生成新字符串
        return String.valueOf(chars);

    }

    public static void main(String[] args) {

        Caesar c = new Caesar();
        //输入
        Scanner input = new Scanner(System.in);

        System.out.println("请输入要加密的字符：");
        String str = input.nextLine();

        //后移位数
        int n = 2;

        //进行加密
        String processStr = c.process(str, n);

        //加密后字符
        System.out.println(processStr);

    }

}
