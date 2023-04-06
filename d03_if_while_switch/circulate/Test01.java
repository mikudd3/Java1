package itheima.java1.d03_if_while_switch.circulate;

import java.util.Scanner;

/**
 * @project: 需求:键盘录入一个大于等于2的整数×，计算并返回×的平方根结果只保留整数部分
 * 小数部分将被舍去。
 * @author: mikudd3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                System.out.println(i + "就是" + num + "的平方根");
                break;
            } else if (i * i > num) {
                System.out.println((i - 1) + "就是" + num + "的整数部分");
                break;
            }
        }
    }
}
