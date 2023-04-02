package com.lanqiao.javalearn.java1.test7.od1;

/**
 * @project: 学生类测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        //使用不同参数列表的构造方法创建xiaolan、xiaoliu、xiaonan三个学生类对象
        Student xiaolan = new Student("小蓝", 22, 1, 4);
        Student xiaoliu = new Student("小刘", 21, 2);
        Student xiaonan = new Student("小南");
        xiaonan.setSex(1);

        xiaolan.learn();
        String rstString = xiaolan.doHomework(22);
        System.out.println(rstString);

        //调用xiaoliu对象的learn()方法
        xiaoliu.learn();
        //调用xiaoliu对象的getName()和getGrade()方法获得属性值
        System.out.println(xiaoliu.getName() + "正在读大学" + xiaoliu.getGrade() + "年级");
        //调用xiaonan对象的doHomework(23)方法
        System.out.println(xiaonan.doHomework(23));
    }
}
