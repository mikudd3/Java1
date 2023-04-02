package com.lanqiao.javalearn.java1.test4.testarray;

/**
 * 数组反转
 *
 * @author mikudd3
 */
public class TestInputArray {
    public static void main(String[] args) {
        var ia = new InputArray();

        //输入数据
        var arr = ia.input();

        //反转数组
        arr = ia.reverseArray(arr);

        //输出数组
        ia.showArray(arr);


    }
}
