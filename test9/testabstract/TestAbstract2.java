package com.lanqiao.javalearn.java1.test9.testabstract;

/**
 * @project: 抽象类的基本使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestAbstract2 {
    public static void main(String[] args) {
        // 抽象类不能实例化
        // ClassC cc1 = new ClassC();
        // ClassC cc2 = new ClassC("Tom");

        ClassD cd = ClassD.getInstance();
        cd.methodC();
    }
}

// 包含抽象方法的类，必须声明为抽象类。
abstract class ClassA {
    public abstract void methodA();
}

// 抽象类中不一定需要包含抽象方法。
abstract class ClassB {
    public void methodB() {
        System.out.println("methodB()");
    }
}

// 抽象类中可以有构造方法，但不能被外部使用。
abstract class ClassC {
    private String name;

    public ClassC() {

    }

    protected ClassC(String _name) {
        this.name = _name;
    }

    public abstract void methodC();
}

// 子类不重写父类中的抽象方法，那么子类可以声明为抽象类，否则编译会有错误。
abstract class ClassD extends ClassC {
    public ClassD() {
        super("Rose");
    }

    // 静态方法，返回抽象类ClassD实例
    public static ClassD getInstance() {
        return new ClassE();
    }
}

// 有一些抽象类不希望你去关注它的子类，那么会在抽象类中提供一个静态的方法，返回该抽象类的实例。
class ClassE extends ClassD {
    @Override
    public void methodC() {
        System.out.println("重写了 methodC 方法");
    }
}
