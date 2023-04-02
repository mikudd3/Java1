package com.lanqiao.javalearn.java1.test3.testwhile;

/**
 * while 循环的基本使用
 *
 * @author mikudd3
 */
public class Preview3 {
    public static void main(String[] args) {

        //和
        int sum = 0;

        //开始
        int start = 1;
        //结束
        int end = 100;

//        while (start <= end) {
//            sum += start;
//            start++;
//        }

//        do {
//            //循环体
//            sum = sum + start;
//            //条件变化
//            start = start + 1;
//            //条件判断布尔表达式
//        } while (start <= end);
        for(start = 1;start <=end;start = start + 1){
            //循环体
            sum = sum + start;
        }

        System.out.println("1 - 100 累加结果是:" + sum);
    }
}
