package com.lanqiao.javalearn.java1.test8.od;

/**
 * @project: 测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {


        //创建人类
        var p = new Person("小蓝", "16655557777");
        System.out.println(p);

        //创建学生
        var s = new Student("小红", "15588885555", "大一");
        System.out.println(s);

        //创建员工
        var e = new Employee("小白", "17676765656", 4000);
        System.out.println(e);

    }
}
