package com.lanqiao.javalearn.java1.test6.task;

/**
 * @project: 通过测试类（Test）实现教师（Teacher）和学生（Student）间的互动。
 * @author: mikudd3
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //无参构造
        //创建学生
        var t1 = new Teacher();
        t1.name = "张三";
        var t2 = new Teacher();
        t2.name = "李四";
        t2.scoreName = "Java高级";
        //创建学生
        var s1 = new Student();
        s1.name = "mikudd3";
        t1.teach(s1);
        t2.teach(s1);
        s1.learn(t1);
        s1.learn(t2);
        System.out.println("--------------------------");

        //有参构造
        //创建老师
        var t3 = new Teacher("王五", "Java基础");
        var t4 = new Teacher("赵六");
        //创建学生
        var s2 = new Student("mikudd3");
        t3.teach(s2);
        t4.teach(s2);
        s2.learn(t3);
        s2.learn(t4);
        System.out.println("--------------------------");
    }
}



