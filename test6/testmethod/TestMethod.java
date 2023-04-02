package com.lanqiao.javalearn.java1.test6.testmethod;

/**
 * @project: 计算 1+2+3...+100 的和
 * @author: mikudd3
 * @version: 1.0
 */
public class TestMethod {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("1~100的和：" + sum);
    }

    /**
     * 定义计算 1～100 的和的方法
     * 返回值类型：计算结果为int类型；
     * 参数：没有确切的数据。
     *
     * @return
     */
    public static int getSum() {
        //定义变量保存求和并赋予初始值0
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        // return 是用来返回结果的
        return sum;
    }
}
