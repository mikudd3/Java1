package com.lanqiao.javalearn.java1.test3.testbreak;

/**
 * break 的基本使用
 *
 * @author mikudd3
 */
public class BreakDemo {
    public static void main(String[] args) {
        // 定义目标次数
        int target = 100;
        System.out.println("开始翻书");
        int times = (int) (Math.random() * 100 + 1);

        for (int i = 1; i <= target; i++) {
            System.out.println("开始第 " + i + "次训练");
            if (i == times) {
                System.out.println("今天就练 " + times + " 次");
                break;
            }
        }
    }
}
