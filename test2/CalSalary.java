package com.lanqiao.javalearn.java1.test2;

import java.util.Scanner;

/**
 * 计算 Java 工程师的薪资
 *
 * @author mikudd3
 */
public class CalSalary {
    public static void main(String[] args) {
        //用户键盘输入月底薪、
        Scanner input = new Scanner(System.in);
        System.out.println("请输入Java工程师月底新：");
        double baseSalary = input.nextDouble();     //月底薪

        // 月工作完成分数（最小值为 0，最大值为 150）、
        System.out.println("请输入Java月工作完成分数（最小值为 0，最大值为 150）：");
        int score = input.nextInt();

        // 月实际工作天数
        System.out.println("请输入Java工程师月实际工作天数：");
        int day = input.nextInt();

        //月保险
        System.out.println("请输入Java工程师月保险：");
        double insurance = input.nextDouble();

        //月餐补 = 月实际工作天数 × 15。
        double mealSupplements = day * 15;

        //月实际绩效 = 月绩效基数（月底薪 × 25% ）× 月工作完成分数（最小值为 0，最大值为 150 ）/ 100。
        double performance = baseSalary * 0.25 * score / 100;

        //java 工程师月薪 = 月底薪 + 月实际绩效 + 月餐补 - 月保险
        double monthSalary = baseSalary + performance + mealSupplements - insurance;
        System.out.println("java工程师月薪为：" + monthSalary);

    }
}
