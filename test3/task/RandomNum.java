package com.lanqiao.javalearn.java1.test3.task;

import java.util.Random;

/**
 * 循环产生一个1-100 的随机数，
 * 若随机数是50，输出随机数并终止程序，
 * 否则继续。（自行查阅资料学习如何生成随机数）
 * @author mikudd3
 */
public class RandomNum {
    public static void main(String[] args) {

        //生成随机数
        Random ran = new Random();
        while(true){
            int randomNum = ran.nextInt(100) + 1;

            if(randomNum == 50){
                System.out.println(randomNum);
                break;
            }

        }


    }
}
