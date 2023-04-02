package com.lanqiao.javalearn.java1.test7.od1;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student {
    private String name;  // 学生姓名
    private int age;       // 学生年龄
    private int sex;       // 学生性别 0:女 1:男
    private int grade;     // 学生年级

    /**
     * 构造方法，用户初始化对象的属性
     */
    public Student(String name, int age, int sex, int grade) {
        //调用Student类中得另一个构造方法
        this(name, age, sex);
        this.grade = 4;
    }

    /**
     * 构造方法，用户初始化对象的属性（不带年级参数，设置年级默认值为4）
     */
    public Student(String name, int age, int sex) {
        this(name, sex);
        this.age = age;
        this.grade = 4;
    }

    /**
     * 构造方法，用户初始化对象的属性
     * 不带年龄、年级参数，设置年龄默认值为22，年级默认值为4
     */
    public Student(String name, int sex) {
        this.sex = sex;
        this.name = name;
        this.age = 22;
        this.grade = 4;
    }

    public Student(String name) {
        this.name = name;
        this.age = 22;
        this.grade = 4;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getGrade() {
        return grade;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
        else
            this.age = 0;
    }

    /**
     * 定义听课的方法，在控制台直接输出
     */
    public void learn() {
        System.out.println(name + "正在认真听课！");
    }

    /**
     * 定义写作业的方法，输入时间，返回字符串
     */
    public String doHomework(int hour) {
        return "现在是北京时间:" + hour + "点，" + name + " 正在写作业！";
    }
}
