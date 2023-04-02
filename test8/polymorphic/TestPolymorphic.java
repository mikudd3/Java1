package com.lanqiao.javalearn.java1.test8.polymorphic;


public class TestPolymorphic {
    public void method1() {
        //子类到父类
        Person p = new Student();

        p.setName("小李子");
        p.setSex("男");

        System.out.println(p.getInfo());
    }

    public void method2() {
        Person p = new Student();

        Student s = (Student) p;
        s.setSchool("清华大学");
        System.out.println(s.getInfo());
    }

    public void method3(Person p) {
        //判断类型是否匹配，这里我们需要提到的是 instanceof 运算符，这也是关键字。
        //通过 instanceof 来进行类型的判断，类型匹配我们可以造型，这样可以避免造型异常。
        if (p instanceof Student) {
            Student s = (Student) p;

            s.setSchool("浙江大学");
        } else if (p instanceof Person) {
            p.setName("小凳子");
        }
    }

    public static void main(String[] args) {
        var tp = new TestPolymorphic();
        tp.method1();
        tp.method2();
        tp.method3(new Student());
        tp.method3(new Person());
    }
}
