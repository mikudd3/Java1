package com.lanqiao.javalearn.java1.test5.teststring;

import java.util.Scanner;

/**
 * @project: 统计字符串出现次数
 * @author: mikudd3
 * @version: 1.0
 */
public class Statistical {
    public static void main(String[] args) {
        //输入
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str1 = input.nextLine();
        System.out.println("请输入子字符串：");
        String str2 = input.nextLine();

        //使用indexOf函数进行查找
        System.out.println(str2 + "在" + str1 + "内出现的次数为：" + indexOf(str1,str2));
    }

    /**
     * 统计字符串出现次数
     * @param str1
     * @param str2
     * @return
     */
    public static int indexOf(String str1, String str2) {
        int start = 0;//开始位置
        int count = 0;//计数器
        while (str1.indexOf(str2, start) >= 0 && start < str1.length()) {
            count++;
            int num = str1.indexOf(str2, start);
            //中国首都是北京，北京很大，当找到北京两字时，start返回的是北京前面的“是”位置的下标，
            //这时候就只要在“是”位置下标加上之后继续遍历即可
            start = num + str2.length();
        }
        return count;
    }
}
