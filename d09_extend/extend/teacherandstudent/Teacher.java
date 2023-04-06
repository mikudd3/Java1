package itheima.java1.d09_extend.extend.teacherandstudent;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class Teacher extends Person {
    private double salary;  //工资

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Teacher() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
