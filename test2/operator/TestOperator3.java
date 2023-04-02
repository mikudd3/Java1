package com.lanqiao.javalearn.java1.test2.operator;

/**
 * 逻辑运算符的使用
 *
 * @author mikudd3
 */
public class TestOperator3 {
    public static void main(String[] args) {

        //定义boolean类型
        boolean a = true;
        boolean b = false;
        boolean c;  //默认false

        c = !a;
        System.out.println("!a = " + c);

        c = a && b;
        System.out.println("a && b = " + c);

        c = a || b;
        System.out.println("a || b = " + c);


    }
}
