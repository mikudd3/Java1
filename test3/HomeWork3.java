package com.lanqiao.javalearn.java1.test3;

import java.util.Scanner;

/**
 * 流程控制语句实现多需求
 *
 * @author mikudd3
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你的选择(A,B,C,D,E):");
            String select = input.next();

            switch (select) {
                case "A": {
                    //求范围内质数
                    System.out.println("请指定质数查找的范围：");
                    int n = input.nextInt();
                    boolean flag = true;
                    for (int i = 2; i <= n; i++) {
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                flag = false;
                                break;
                            }
                        }
                        if (true == flag) {
                            System.out.print(i + " ");
                        }
                        flag = true;
                    }
                    System.out.println();
                    break;
                }
                case "B": {
                    //求最大公约数
                    System.out.println("请指定一个数：");
                    int a1 = input.nextInt();
                    System.out.println("请指定第二个数：");
                    int a2 = input.nextInt();

                    int min = Math.max(a1, a2);
                    for (int i = min; i >= 1; i--) {
                        if (a1 % i == 0 && a2 % i == 0) {
                            System.out.println("最大公约数为：" + i);
                            break;
                        }
                    }
                    break;
                }
                case "C": {
                    //输出1000以内的水仙花数
                    int num = 0;
                    for (int i = 100; i < 1000; i++) {
                        num = i;
                        //个位
                        int a = num % 10;
                        //十位
                        int b = num / 10 % 10;
                        //百位
                        int c = num / 10 / 10;
                        if (a * a * a + b * b * b + c * c * c == i) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                }
                case "D": {
                    System.out.println("请指定奇数求和范围：");
                    int num = input.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= num; i += 2) {
                        sum += i;
                    }
                    System.out.println(num + "范围内的奇数和为：" + sum);
                    break;
                }
                case "E":
                default:
                    System.out.println("功能未开放");
                    System.exit(0);
                    break;
            }

        }

    }
}