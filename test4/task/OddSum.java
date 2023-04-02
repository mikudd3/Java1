package com.lanqiao.javalearn.java1.test4.task;

/**
 * project 求1000以内的奇数的和（选做：完成后考虑递归实现）
 * @author mikudd3
 */
public class OddSum {
    /**
     * 实现累加
     * @param n
     * @return
     */
    public static int oddSum(int n){
        if(n == 1){
            return 1;
        }

        return n + oddSum(n - 2);
    }

    public static void main(String[] args) {
        /*int sum = 0;
        for(int i = 1;i <= 1000;i += 2){
            sum += i;
        System.out.println(sum);*/

        int sum = oddSum(999);

        System.out.println("1000以内的奇数和为" + sum);
    }

}
