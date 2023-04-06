package itheima.java1.d06_string.scanner;

import java.util.Scanner;

/**
 * @project: 三个和尚升级版，要i去键盘输入身高
 * @author: mikudd3
 * @version: 1.0
 */
public class ThreeMonkPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个和尚身高：");
        int height1 = input.nextInt();
        System.out.println("请输入第二个和尚身高：");
        int height2 = input.nextInt();
        System.out.println("请输入第三个和尚身高：");
        int height3 = input.nextInt();

        int max = height1 > height2 ? height1 : height2;

        System.out.println("最高身高为：" + (max > height3 ? max : height3));
    }
}
