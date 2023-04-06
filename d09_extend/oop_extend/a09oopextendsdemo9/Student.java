package itheima.java1.d09_extend.oop_extend.a09oopextendsdemo9;

public class Student {
    String name;
    int age;
    String school;

    //需求：
    //默认为传智大学

    public Student() {
        //表示调用本类其他构造方法
        //细节：虚拟机就不会再添加super();
        this(null,0,"传智大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
