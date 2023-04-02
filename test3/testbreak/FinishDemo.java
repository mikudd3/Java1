package com.lanqiao.javalearn.java1.test3.testbreak;

/**
 * 结束循环的其它方式
 *
 * @author mikudd3
 */
public class FinishDemo {
    public static void main(String[] args) {
        System.out.println("程序开始执行");
        flag:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (k == 1) {
                        //请在此处补充代码，实现当 k = 1 时，退出所有循环
                        System.out.println("所有循环结束");
                        break flag;

                    }
                }
            }
        }
        System.out.println("程序结束执行");
    }
}

