package itheima.java1.d06_string.string;

import java.util.Scanner;

/**
 * @project: 提取身份证信息
 * @author: mikudd3
 * @version: 1.0
 */
public class TestString01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入身份证
        String id = input.next();

        //获取出生年日月
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("人物信息为：");
        System.out.println("年：" + year + "\t月：" + month + "\t日：" + day);

        //获取性别
        char c = id.charAt(16);
        int num = c - 48;
        if (num % 2 == 0) {
            System.out.println("性别：" + "女");
        } else {
            System.out.println("性别：" + "男");
        }

    }
}
