package com.lanqiao.javalearn.java1.test4.testarray;

/**
 * 交换两个数的位置
 *
 * @author mikudd3
 */
public class TestArray3 {
    public static void main(String[] args) {
        int engNo1 = 1001;
        int engNo2 = 1002;

        System.out.println("传递值交换数值：");
        //调用前
        System.out.println("调用前第1、第2编号为：" + engNo1 + "\t" + engNo2);
        //值传递，传递的实质是数值的副本，所以没有交换原值

        exchange1(engNo1, engNo2);

        //调用后
        System.out.println("调用后第1、第2编号为：" + engNo1 + "\t" + engNo2);

        int[] engNo = new int[2];

        //给数组赋值
        engNo[0] = 1001;
        engNo[1] = 1002;

        System.out.println("传递引用交换数值：");
        //调用前

        System.out.println("调用前第1、第2编号为：" + engNo[0] + "\t" + engNo[1]);
        //传递引用类型，传递的实质是指向数组的地址，所以交换了数组里的值
        exchange2(engNo);
        //调用后

        System.out.println("调用后第1、第2编号为：" + engNo[0] + "\t" + engNo[1]);

    }


    /**
     * 传递基本数据类型，交换int型a和b的值
     */
    public static void exchange1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    /**
     * 传递引用数据类型，交换数组x第1个元素和第2个元素的值
     */
    public static void exchange2(int[] x) {
        int temp = x[0];
        x[0] = x[1];
        x[1] = temp;
    }
}

