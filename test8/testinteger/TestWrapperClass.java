package com.lanqiao.javalearn.java1.test8.testinteger;
/**
 * 包装类的基本使用
 * @author mikudd3
 */
public class TestWrapperClass {
    /**
     * Integer 类创建和常用方法
     */
    public void method1(){

        //创建Integer对象
        Integer i1 = new Integer(100);

        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);   //false

        //Integer i3 = new Integer("abc");
        // 通过 valueOf 获取 Integer 对象

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");

        System.out.println(i3 == i4);   //false

        // 将 Integer 类型转换为 int 类型
        int i5 = i1.intValue();
        int i6 = i2.intValue();

        // 将 String 类型数据转换为 int 类型，前提条件字符串数据必须是整型数据。
        int i7 = Integer.parseInt("200");

        System.out.println(i6 == i7);   //false



    }
    public void method2(){
        // 自动装箱
        Integer i1 = 100;
        System.out.println(i1);//100

        // 自动拆箱
        int i2 = i1;

        // 在 byte 类型取值范围之内，数值相同指向同一地址空间
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);//true

        // 超出范围的，都需要申请空间存放
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);//false

        // 进行数值计算和比较时，可以自动拆箱处理操作
        int i7 = 20;
        System.out.println(i7 < i3);//true
        System.out.println(i6 + 30);//158

        // 当字符串转换为简单类型，无法自动完成
        String s = "123";
        // int i = (int)s + 456;
        int i = Integer.parseInt(s) + 456;
        System.out.println(i);//579

        // 简单类型转换为字符串
        String s2 = i7 + "";
        String s3 = String.valueOf(i7);
        String s4 = Integer.valueOf(i7).toString();
        System.out.println(s2);//20
        System.out.println(s3);//20
        System.out.println(s4);//20

    }

    public static void main(String[] args) {
        TestWrapperClass twc = new TestWrapperClass();
        //twc.method1();
        twc.method2();
    }
}
