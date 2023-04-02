package com.lanqiao.javalearn.java1.test9.enumclass;

public class Person {

    private String  name;
    private Sex sex;
    private int  age;

    public Person(){

    }

    public Person(String name, Sex sex, int age) {
        this(sex,age);
        this.name = name;
    }

    public Person(Sex sex, int age) {
        this.sex = sex;
        this.age = age;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [age=" + getAge() + ",name=" + getName() + ",sex=" + getSex() +"]";
    }
}
