package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * 单分支结构的使用
 *
 * @author mikudd3
 */
public class Preview1 {
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner input = new Scanner(System.in);

        System.out.println("请输入成绩：");

        //定义变量接收从控制台输入的信息
        int score = input.nextInt();

        // 使用比较运算符完成成绩比对，进入对应的分支
        if (score >= 90) {
            System.out.println("你真是太优秀了");
        } else if (score >= 80) {
            System.out.println("良好的开端，可以更上一层楼哦");
        } else if (score >= 70) {
            System.out.println("开局虽然一般，但你的进度空间非常大");
        } else if (score >= 60) {
            System.out.println("恭喜你及格了");
        } else {
            System.out.println("你还要继续努力哦");
        }
        System.out.println("你的成绩是：" + score);
    }
}
