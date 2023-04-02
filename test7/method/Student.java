package com.lanqiao.javalearn.java1.test7.method;

/**
 * @project: 方法重载学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;

    // 构造方法，用户初始化对象的属性
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 给属性添加 setter/getter 方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    /**
     * 学生读书的方法(如果参数的值是默认值，就代表不需要使用该变量。
     * 例如，当 bookAuthor 的值是 null 时，就不用打印 bookAuthor 这一属性)
     */
    public void read(String bookName, String bookAuthor, double bookPrice) {
        // 当 bookAuthor 使用的是默认值时，就只打印 bookName 和 bookPrice
        if (bookName != null && bookAuthor == null && bookPrice != 0.0) {
            System.out.println(this.name + "正在读《" + bookName + "》，书价：" + bookPrice);
        }

        // 当 bookPrice 使用的是默认值时
        if (bookName != null && bookAuthor != null && bookPrice == 0.0) {
            System.out.println(this.name + "正在读《" + bookName + "》，作者：" + bookAuthor);
        }

        //当全部的参数都使用的是默认值时
        if (bookName == null && bookAuthor == null && bookPrice == 0.0) {
            System.out.println(this.name + "正在读书");
        }

        //当全部的参数都使用的不是默认值时
        if (bookName != null && bookAuthor != null && bookPrice != 0.0) {
            System.out.println(this.name + "正在读《" + bookName + "》，作者：" + bookAuthor
                    + "，书价：" + bookPrice);
        }
    }

    /**
     * 以下三个方法，演示了如何在重载中复用已有的方法
     */
    public void read(String bookName, String bookAuthor) {
        this.read(bookName, bookAuthor, 0.0);
    }

    public void read(String bookName, double bookPrice) {
        this.read(bookName, null, bookPrice);
    }

    public void read(String bookName) {
        this.read(bookName, null, 0.0);
    }

    public void read() {
        this.read(null, null, 0.0);
    }
}
