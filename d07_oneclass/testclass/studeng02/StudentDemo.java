package itheima.java1.d07_oneclass.testclass.studeng02;

/**
 * @project: 学生类测试
 * @author: mikudd3
 * @version: 1.0
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用set方法给成员变量赋值
        s.setName("mikudd3");
        s.setAge(20);

        //使用get方法获取成员变量
        System.out.println(s.getName() + "," + s.getAge());
    }
}
