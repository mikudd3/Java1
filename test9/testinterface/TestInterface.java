package com.lanqiao.javalearn.java1.test9.testinterface;

/**
 * @project: 接口的使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestInterface {
    public static void main(String[] args) {
        System.out.println(InterfaceA.ID);
        System.out.println(InterfaceB.SELECT_PERSON_ALL);
        System.out.println("---InterfaceD 进行访问---");
        System.out.println(InterfaceD.ID);
        System.out.println(InterfaceD.SELECT_PERSON_ALL);

        System.out.println("---ClassA 进行访问---");
        new ClassA().method1();
        System.out.println(new ClassA().method2(1, 1));
        new ClassA().method3();
        new ClassA().method4();
        new ClassA().method5("mikudd3");

        System.out.println("---ClassZ 进行访问---");
        new ClassZ().method1();

    }
}

// 声明接口
interface InterfaceA {
    int ID = 100;

    void method1();
}

interface InterfaceB {
    String SELECT_PERSON_ALL = "SELECT id,name,sex,birthday FROM persons";

    public double method2(int a, int b);
}

interface InterfaceC {
    // 接口中不能构造方法
    /*
      public InterfaceC(){

    }
    */
    // 接口中只有方法的声明，不能有方法体
    /*
      public void method3(){

    }
    */
    public void method3();
}

interface InterfaceD extends InterfaceA, InterfaceB {
    public void method4();
}

interface InterfaceE extends InterfaceC {
    public String method5(String name);
}

// 一个类实现不同的接口
class ClassA implements InterfaceD, InterfaceE {
    @Override
    public void method4() {
        System.out.println("实现了 method4 方法");
    }

    @Override
    public void method1() {
        System.out.println("实现了 method1 方法");
    }

    @Override
    public double method2(int a, int b) {
        System.out.println("实现了 method2 方法");
        return a + b;
    }

    @Override
    public String method5(String name) {
        System.out.println("实现了 method5 方法");
        return name;
    }

    @Override
    public void method3() {
        System.out.println("实现了 method3 方法");
    }
}

interface InterfaceX {
    public void method1();
}

interface InterfaceY {
    public void method1();
}

class ClassZ implements InterfaceX, InterfaceY {
    @Override
    public void method1() {

    }
}
