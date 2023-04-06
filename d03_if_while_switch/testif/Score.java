package itheima.java1.d03_if_while_switch.testif;

import java.util.Scanner;

/**
 * @project: 考试奖励
 * @author: mikudd3
 * @version: 1.0
 */
public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入小明的考试成绩：");
        int score = input.nextInt();

        if (score >= 95) {
            System.out.println("山地自行车一辆");
        } else if (score >= 90) {
            System.out.println("游乐场玩一次");
        } else if (score >= 80) {
            System.out.println("变形金刚一个");
        } else {
            System.out.println("胖揍一顿");
        }
    }
}
