package itheima.java1.d09_extend.extend.teacherandstudent;

/**
 * @project: 测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setNo("1001");
        s.setName("mikudd3");
        s.setAge(20);
        System.out.println("学生:" + s.getName() + ",学号：" + s.getNo() + ",年龄：" + s.getAge());

        Teacher t = new Teacher();
        t.setName("张三");
        t.setAge(50);
        t.setSalary(7000);
        System.out.println("老师:" + t.getName() + ",工资：" + t.getSalary() + ",年龄：" + t.getAge());

    }
}
