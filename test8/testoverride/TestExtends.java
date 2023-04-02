package com.lanqiao.javalearn.java1.test8.testoverride;

/**
 * @project: 重写测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestExtends {
    public static void main(String[] args) {
        // 创建子类对象
        Student s = new Student();
        // 访问父类中的成员
        s.setName("小桃子");
        s.setSex("女");
        s.setBirthday(null);
        System.out.println(s.getInfo());

        // 访问子类中的成员
        s.setSchool("浙江大学");
        System.out.println(s.getInfo() + "   " + s.getSchool());

        // 创建父类对象
        Person p1 = new Person();
        System.out.println(p1);
        System.out.println(p1.toString());


        // 创建 Object 对象进行比较
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1 == obj2);

        // 创建 String 对象进行比较
        String str1 = "hello";
        // 编译和运行不会报错
        System.out.println(obj1.equals(str1));

        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
