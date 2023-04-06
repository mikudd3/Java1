package itheima.java1.d03_if_while_switch.circulate;

import java.util.Scanner;

/**
 * @project: 需求:键盘录入一个正整数x，判断该整数是否为一个质数。
 * @author: mikudd3
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = input.nextInt();
        //判断是否为质数标志
        boolean flag = true;
        //循环，如果从2到该数本身之间有一个数可以整除该数，则不是质数
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }
    }
}
