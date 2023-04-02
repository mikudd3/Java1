package com.lanqiao.javalearn.java1.test8.testfinal;

/**
 * @project: final 关键字修饰属性的使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestFinal {
    // 声明成员变量
    int i = 10;

    // 简单类型变量被final修饰，那就是常量，必须进行一次显式初始化操作
    final float PI = 3.1415926f;

    //引用类型变量被final修饰，不可改变的地址空间
    final ClassA C_A = new ClassA();

    /**
     * 在方法中的变量可以采用 final 修饰，但不能使用 static 修饰
     */
    public void method1(final String name) {
        final String STR = "hello";
        // 重新指向新的地址空间是不允许的
        // STR = "world";
        System.out.println(STR + name);
    }

    public static void main(String[] args) {
        var tf = new TestFinal();
        tf.i = 20;
        // tf.PI = 3.14f;    常量不可改变值
        // tf.C_A = new ClassA(); 对象不可改变地址空间
        System.out.println(tf.C_A.getId());
        tf.C_A.setId(20);
        System.out.println(tf.C_A.getId());

        tf.method1("小桃子");
    }
}

class ClassA {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // 被final修饰的方法，不能被子类中重写
    public final void method1() {

    }

    public void method2() {

    }
}

class ClassB extends ClassA {

    //    @Override
//    public void method1(){
//
//    }
    @Override
    public void method2() {
        super.method2();
    }
}

final class ClassC {
    public void method1() {

    }

    public String method2() {
        return null;
    }
}
//class ClassD extends ClassC{
//
//}
