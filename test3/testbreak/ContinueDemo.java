package com.lanqiao.javalearn.java1.test3.testbreak;

import java.util.Scanner;

/**
 * continue 的基本使用
 *
 * @author mikudd3
 */
public class ContinueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入参加考试的课程数量：");

        // 定义课程数量
        int courseCount = input.nextInt();
        // 考试通过的课程数量
        int passCount = 0;
        // 定义总分
        int sum = 0;

        for (int i = 1; i <= courseCount; i++) {
            System.out.print("请输入第 " + i + " 门课的成绩");

            int score = input.nextInt();

            sum += score;
            if (score < 60) {
                //如果低于60分，本次循环的后续代码就不再执行，进入下一次
                continue;

            }
            //及格课程数加 1
            passCount++;
        }
        System.out.println("总分共 " + sum + " 分， 通过 " + passCount
                + " 门，及格率为" + passCount * 100 / courseCount + "% ，平均分:" + sum / courseCount);
    }
}

