package itheima.java1.d06_string.string;

import java.util.Scanner;

/**
 * @project: 手机号加密
 * @author: mikudd3
 * @version: 1.0
 */
public class TestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("亲输入一个手机号：");
        String s = input.next();

        //截取手机号前面3为
        String start = s.substring(0, 3);

        //截取手机号后面4位
        String end = s.substring(7);

        //拼接
        String result = start + "****" + end;
        System.out.println("加密后的手机号为：" + result);
    }
}
