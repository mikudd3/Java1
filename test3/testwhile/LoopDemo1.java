package com.lanqiao.javalearn.java1.test3.testwhile;

/**
 * while 循环实现举重训练
 *
 * @author mikudd3
 */
public class LoopDemo1 {
    public static void main(String[] args) {
        //初始条件
        int start = 1;
        // while(start <= 100){
        //     System.out.println("完成第"+start+"次挺举");
        //     start ++;
        // }

        // do{
        //     System.out.println("完成第"+start+"次挺举");
        //     start ++;
        // }while(start <= 100);

        for (start = 1; start <= 100; start++) {
            System.out.println("完成第" + start + "次挺举");
        }
    }
}

