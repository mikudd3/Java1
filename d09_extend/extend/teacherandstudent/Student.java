package itheima.java1.d09_extend.extend.teacherandstudent;

/**
 * @project: 学生类
 * @author: mikudd3
 * @version: 1.0
 */
public class Student extends Person {
    private String no;  //学号

    public Student(String name, int age, String no) {
        super(name, age);
        this.no = no;
    }

    public Student() {

    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
