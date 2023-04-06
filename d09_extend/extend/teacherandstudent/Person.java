package itheima.java1.d09_extend.extend.teacherandstudent;

/**
 * @project: 人类
 * @author: mikudd3
 * @version: 1.0
 */
public class Person {
    private String name;    //姓名
    private int age;        //年龄

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
