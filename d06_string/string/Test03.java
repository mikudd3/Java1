package itheima.java1.d06_string.string;

import java.util.Scanner;

/**
 * @project: 统计字符出现次数
 * 键盘录入一个字符串，统计该字符串种大写字母字符，小写字母字符，数字字符出现的次数
 * @author: mikudd3
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = input.next();

        int big = 0;    //大写字母次数
        int small = 0;  //小写字母次数
        int num = 0;    //数字次数

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                big++;
            } else if (c >= 'a' && c <= 'z') {
                small++;
            } else if (c >= '0' && c <= '9') {
                num++;
            }
        }


        System.out.println("大写字母出现次数：" + big);
        System.out.println("小写字母出现次数：" + small);
        System.out.println("数字出现次数：" + num);

    }
}
