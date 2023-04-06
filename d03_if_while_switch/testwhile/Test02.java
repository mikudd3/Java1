package itheima.java1.d03_if_while_switch.testwhile;

import java.util.Scanner;

/**
 * @project: 求商和余数，不能使用乘法，除法和%
 * @author: mikudd3
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入除数：");
        int dividend = input.nextInt();
        System.out.println("请输入被除数");
        int divisor = input.nextInt();

        //商
        int count = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }

        System.out.println("商：" + count);
        System.out.println("余数：" + dividend);
    }
}
