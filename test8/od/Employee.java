package com.lanqiao.javalearn.java1.test8.od;

/**
 * @project: 员工类
 * @author: mikudd3
 * @version: 1.0
 */
public class Employee extends Person {

    private double salary;

    public Employee() {

    }

    public Employee(String name, String phone, double salary) {
        super(name, phone);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{name=" + getName() + "，phone=" + getPhone() + ",salary=" + getSalary() + "}";
    }

}
