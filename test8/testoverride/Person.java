package com.lanqiao.javalearn.java1.test8.testoverride;


import java.util.Date;

/**
 * @project: person类
 * @author: mikudd3
 * @version: 1.0
 */
public class Person {
    // 姓名
    private String name;
    // 性别
    private String sex;
    // 年龄
    private Date birthday;

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
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 当传入的参数为 null 时，obj 还不是对象，没有可比性，直接返回 false。
        if (obj == null) {
            return false;
        }
        // 当传入的参数对象和当前对象指向同一个地址空间时，无须比较肯定一致，直接返回 true。
        if (this == obj) {
            return true;
        }
        // 当传入参数对象的类型和当前对象类型不一致时，没有可比性，直接返回 false。
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        // 参数是 Object 类型，所以需要进行引用类型强类型转换。
        Person p = (Person) obj;
        // Person 类中传递的值都需要进行比较
        return this.name.equals(p.name) && this.sex.equals(p.sex) && this.birthday.equals(p.birthday);
    }

    @Override
    public int hashCode() {
        int result = 0;
        // 用对象的所有属性值作为 hashcode 的计算因子
        result = result * 31 + name.hashCode();
        result = result * 31 + sex.hashCode();
        result = result * 31 + birthday.hashCode();
        return result;
    }
}
