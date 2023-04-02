package com.lanqiao.javalearn.java1.test9.innerclass;

/**
 * 静态内部类的使用
 * @author mikudd3
 */
public class TestInnerClass2 {
    public static void main(String[] args) {
        // 静态内部类对象创建
        OuterClass1.InnerClass inner = new OuterClass1.InnerClass();
        inner.method3();
        OuterClass1.InnerClass.method4();

        // 成员内部类对象创建
        OuterClass1.InnerClass2 inner2 = new OuterClass1().new InnerClass2();
        inner2.method();
    }
}
// 外部类
class OuterClass1{
    //属性
    private static String name = "Rose";
    private int age = 10;

    //方法
    public void method1() {
        System.out.println(name + "   " + age);
    }

    public static void method2() {
        System.out.println(name);
    }

    public static class InnerClass{
        private int num = 20;
        private static String sex = "Male";

        public void method3(){
            System.out.println(num);
            System.out.println(sex);
            // 非静态成员不能在静态类中使用
            // method1();
        }

        public static void method4(){
            // 非静态成员不能在静态方法中访问
            // System.out.println(num);
            System.out.println(sex);
            method2();
        }
    }

    // 成员内部类中不能声明静态的成员
    public class InnerClass2{
        // private static int a = 10;
        // public static void method(){

        // }
        public void method(){
            method1();
            method2();
        }
    }
}
