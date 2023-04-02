package com.lanqiao.javalearn.java1.test3.task;

import java.util.Scanner;

/**
 * project :从控制台输入一个成绩score（score∈[0,100]），
 *     score大于等于90,输出A；
 *     大于等于80小于90输出B；
 *     大于等于70小于80输出C；
 *     大于等于60小于70输出D;
 *     低于60输出E.
 *     （分别使用 if...else 和 switch 结构实现）。
 * @author mikudd3
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = input.nextInt();

        if(score >= 90){
            System.out.println("A");
        }else if(score >= 80){
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("C");
        }else if(score >= 60){
            System.out.println("D");
        }else{
            System.out.println("E");
        }

        System.out.println("--------------------if-----------------------");

        if(score > 100 || score < 0){
            System.out.println("输入成绩有误");
        }else{
            switch (score / 10){
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
                    break;
            }
        }

        System.out.println("--------------------switch-----------------------");

    }
}
