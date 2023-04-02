package com.lanqiao.javalearn.java1.test8.od;

/**
 * @project: 人类
 * @author: mikudd3
 * @version: 1.0
 */
public class Person {
    private String name;

    private String phone;

    public Person() {
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{name=" + getName() + "，phone=" + getPhone() + "}";
    }
}

