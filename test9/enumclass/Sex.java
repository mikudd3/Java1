package com.lanqiao.javalearn.java1.test9.enumclass;
enum Sex {


    MALE(1, "男"), FEMALE(0, "女");

    // 声明序号
    private int value;
    // 声明名称
    private String sex;

    // 声明构造方法
    private Sex(int value, String sex) {
        this.value = value;
        this.sex = sex;
    }

    // 获取序号信息
    public int getValue() {
        return value;
    }

    // 获取名称信息
    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return getSex();
    }
}
