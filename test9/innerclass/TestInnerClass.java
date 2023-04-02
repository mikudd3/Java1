package com.lanqiao.javalearn.java1.test9.innerclass;

// 外部类

/**
 * 内部类的基本使用
 *
 * @author mikudd3
 */
public class TestInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.method1();
        // 私有的内部类，其他类中是不能访问的，只能在外部类中访问
        // OuterClass.InnerClass2 inner2 = outer.new InnerClass2();

        // 方式一，创建内部类对象
        OuterClass.InnerClass3 inner3 = outer.new InnerClass3();
        System.out.println(inner3.method3(10, 6));
        // 方式二，创建内部类对象
        OuterClass.InnerClass4 inner4 = new OuterClass().new InnerClass4();
        System.out.println(inner4.PI);
        System.out.println(inner4.method4());
    }
}

// OuterClass 为外部类
class OuterClass {
    private int num;

    // InnerClass 为成员内部类
    public class InnerClass {
        public void method2() {
            num = 100;
            System.out.println("在内部类中 num = " + num);
        }
    }

    // 私有的内部类
    private class InnerClass2 {
        private String name = "Tom";
    }

    // 被保护的内部类
    protected class InnerClass3 {
        public double method3(int a, int b) {
            return a + b;
        }
    }

    // 最终的内部类
    public final class InnerClass4 {
        public final double PI = 3.1415926;

        public String method4() {
            return "hello innerclass";
        }
    }

    public void method1() {
        InnerClass inner = new InnerClass();
        inner.method2();

        // 私有内部类的对象创建
        InnerClass2 inner2 = new InnerClass2();
        System.out.println(inner2.name);
    }
}
