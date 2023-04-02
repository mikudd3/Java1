package com.lanqiao.javalearn.java1.test2.type;

/**
 * 常量的使用
 *
 * @author mikudd3
 */
public class TestConstant {
    // 声明静态常量
    public static final String SELECT_USERS_ALL = "SELSECT * FROM users";

    // 声明成员常量
    final String WATER_PATTERN = "H₂O";

    public static void main(String[] args) {
        // 声明局部常量
        final double PI = 3.1415926;
        // 常量 PI 赋值之后其值不可改变。
        // PI = 3.14159265358;
        System.out.println("圆周率 = " + PI);

        /* 常量在使用前必须要赋值，才能使用。
        final int TOTAL;
        System.out.println("总和 = " + TOTAL);
        */
    }
}
