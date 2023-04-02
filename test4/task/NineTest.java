package com.lanqiao.javalearn.java1.test4.task;

/**
 * project 写一个show方法，打印输出乘法口诀表。
 * @author mikudd3
 */

public class NineTest {
    /**
     * 乘法口诀表
     */
    public static void show(){
        System.out.println("乘法口诀表：");
        for(int i = 1;i <= 9;i ++){
            for(int j = 1;j <= i;j ++){
                System.out.print(j + " * " + i + " = " + (i * j) + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        show();
    }
}
