package com.lanqiao.javalearn.java1.test4.testarray;

/**
 * 测试增强 for 循环
 *
 * @author lanqiao
 */
public class TestForeach {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        for (int num : nums) {//增强for循环
            System.out.println(num);
        }
    }
}
