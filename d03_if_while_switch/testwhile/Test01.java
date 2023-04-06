package itheima.java1.d03_if_while_switch.testwhile;

import java.util.Scanner;

/**
 * @project: 回文数
 * @author: mikudd3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");

        int num = input.nextInt();
        int temp = num;
        int reverseNum = 0;

        while (temp != 0) {

            int ge = temp % 10;
            temp /= 10;

            reverseNum = reverseNum * 10 + ge;
        }

        if (reverseNum == num) {
            System.out.println(num + "是回文数");
        } else {
            System.out.println(num + "不是回文数");
        }
    }
}
