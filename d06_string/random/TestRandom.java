package itheima.java1.d06_string.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @project: 猜数字
 * @author: mikudd3
 * @version: 1.0
 */
public class TestRandom {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);

        //生成1到100的随机数
        int target = r.nextInt(100) + 1;

        int count = 0;
        do {
            System.out.println("请猜一个数字");
            int num = input.nextInt();
            count++;

            if (num > target) {
                System.out.println("大了");
            } else if (num < target) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        } while (count < 3);
    }
}
