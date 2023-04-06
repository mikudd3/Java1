package itheima.java1.d02_operator.operator;

import java.util.Scanner;

/**
 * @project: 键盘输入一个字符，计算他的个位，百位，十位
 * @author: mikudd3
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = input.nextInt();

        System.out.println("个位：" + (num % 10));
        System.out.println("十位：" + (num / 10 % 10));
        System.out.println("百位：" + (num / 10 / 10));
    }
}
