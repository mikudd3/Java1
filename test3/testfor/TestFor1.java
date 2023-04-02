package com.lanqiao.javalearn.java1.test3.testfor;

/**
 * project 跳出循环标签的使用
 * @author mikudd3
 */
public class TestFor1 {
    public static void main(String[] args) {

        outer:
        for(int i = 3;i < 100;i ++ ){
            for(int j = 3;j < Math.sqrt(i);j ++){
                if(i % j == 0){
                    continue outer;
                }
            }
            System.out.println(i);
        }


    }
}
