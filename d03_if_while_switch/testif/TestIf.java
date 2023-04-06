package itheima.java1.d03_if_while_switch.testif;

import java.util.Scanner;

/**
 * @project: 任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
 * @author: mikudd3
 * @version: 1.0
 */
public class TestIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个数字：");
        int num = input.nextInt();

        //判断是否为偶数
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
    }
}
