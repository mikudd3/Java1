package com.lanqiao.javalearn.java1.test6.createclss;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student {
    String stuName;  //学生姓名
    int stuAge;      //学生年龄
    int stuSex;      //学生性别
    int stuGrade;    //学生年级

    /**
     * 定义听课的方法，在控制台直接输出
     */
    public void learn() {
        System.out.println(stuName + "正在认真听课！");
    }

    /**
     * 定义写作业的方法，输入时间，返回字符串
     */
    public String doHomework(int hour) {
        return "现在是北京时间:" + hour + "点，" + stuName + " 正在写作业！";
    }
}
