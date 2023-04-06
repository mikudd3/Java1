package itheima.java1.d06_string.string;

import java.util.Scanner;

/**
 * @project: 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 * @author: mikudd3
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = input.next();

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i) + ",");
            }
        }
    }
}
