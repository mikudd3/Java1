package itheima.java1.d06_string.stringbuilder;

import java.util.Scanner;

/**
 * @project: 字符串反转
 * 定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，重载控制台输出结果
 * @author: mikudd3
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = input.next();
        System.out.println("反转后的字符串为：" + reverse(s));

    }

    public static String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);

        return sb.reverse().toString();
    }
}
