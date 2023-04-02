package com.lanqiao.javalearn.java1.test3.testwhile;

import java.util.Scanner;

/**
 * 大胆画出来
 *
 * @author mikudd3
 */
public class Challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("-------- mikudd3 --------");
            System.out.println("1 - 矩形");
            System.out.println("2 - 直角三角形");
            System.out.println("3 - 等腰三角形");
            System.out.println("4 - 菱形");
            System.out.println("5 - 心形");
            System.out.println("0 - 退出");
            System.out.println("-------------------------");
            System.out.println("请选择你要打印的图形：");
            int select = input.nextInt();

            switch (select) {
                case 1 -> {
                    System.out.println("请输入矩形的行数：");
                    int m = input.nextInt();
                    System.out.println("请输入矩形的列数：");
                    int n = input.nextInt();
                    for (int i = 1; i <= m; i++) {
                        for (int j = 1; j <= n; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("请输入直角三角形的高：");
                    int h = input.nextInt();
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("请输入等腰三角形的高：");
                    int h1 = input.nextInt();
                    for (int i = 1; i <= h1; i++) {
                        for (int j = 1; j <= h1 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 4 -> {
                    System.out.println("请输入等腰三角形的高：");
                    int h2 = input.nextInt();
                    int n = (h2 + 1) / 2;
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 5 -> {
                    for (float y = 1.5f; y > -1.5f; y -= 0.15f) {
                        for (float x = -1.5f; x < 1.5f; x += 0.05) {
                            float a = x * x + y * y - 1;
                            if ((a * a * a - x * x * y * y * y) <= 0.0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 0 -> System.exit(0);
            }
        }


    }
}
