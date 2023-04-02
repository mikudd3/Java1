package com.lanqiao.javalearn.java1.test8.polymorphic;

import java.util.Date;

/**
 * 人的基本信息类
 *
 * @author mikudd3
 */
public class Person {
    // 姓名
    private String name;
    // 性别
    private String sex;
    // 年龄
    private Date birthday;

    public Person() {
    }

    public Person(String name, String sex, Date birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取人的基本信息
     *
     * @return 姓名+性别+生日的字符串信息
     */
    public String getInfo() {
        return name + "   " + sex + "   " + birthday;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Person [birthday =" + birthday + ",name=" + name + ",sex=" + sex + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj == null) {
            return false;
        }

        if (this == null) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Person p = (Person) obj;
        return this.name.equals(p.name) && this.sex.equals(p.sex) && this.birthday.equals(p.birthday);
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = result * 31 + name.hashCode();

        result = result * 31 + sex.hashCode();

        result = result * 31 + birthday.hashCode();

        return result;
    }
}
