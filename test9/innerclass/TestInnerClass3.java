package com.lanqiao.javalearn.java1.test9.innerclass;

/**
 * 局部内部类和匿名内部类的使用
 *
 * @author 小桃子
 */
public class TestInnerClass3 {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.method1();
    }
}

// 外部类
class OuterClass2 {
    // 声明属性
    private int num = 100;

    // 声明方法
    public void method1() {
        // 局部内部类
        class InnerClass1 {
            public void innerMethod1() {
                System.out.println("方法体中的局部内部类");
                System.out.println(num);
            }
        }
        // 创建局部内部类对象
        InnerClass1 inner1 = new InnerClass1();
        inner1.innerMethod1();
    }

    // 初始化块
    {
        // 抽象局部内部类
        abstract class InnerClass2 {
            protected abstract void innerMethod2(int num);
        }
        // 局部内部类
        class InnerClass3 extends InnerClass2 {
            private int num = 200;

            @Override
            protected void innerMethod2(int num) {
                System.out.println("初始化块中的局部内部类");
                // 打印参数 num 的值
                System.out.println(num);
                // InnerClass3 中声明的 num 属性
                System.out.println(this.num);
                // OuterClass 中声明的 num 属性
                System.out.println(OuterClass2.this.num);
            }
        }
        // 多态方式创建局部内部类对象
        InnerClass2 inner2 = new InnerClass3();
        inner2.innerMethod2(300);

        /*// 匿名内部类
        new InnerClass2(){
            private int num = 200;
            @Override
            protected void innerMethod2(int num) {
                System.out.println("初始化块中的匿名内部类");
                // 打印参数 num 的值
                System.out.println(num);
                // 匿名类中声明的 num 属性
                System.out.println(this.num);
                // OuterClass 中声明的 num 属性
                System.out.println(OuterClass2.this.num);
            }
        }.innerMethod2(300);*/



    }
}
