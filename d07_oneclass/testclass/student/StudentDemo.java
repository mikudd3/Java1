package itheima.java1.d07_oneclass.testclass.student;

/**
 * @project: 学生测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "mikudd3";
        s.age = 20;
        s.study();
        s.doHomework();
    }
}
