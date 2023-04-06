package itheima.java1.d08_package.block.codeblockdemo2;

public class Student {
    private String name;
    private int age;


    //执行时机：
    //随着类的加载而加载的，并且只执行一次。
    static {
        System.out.println("静态代码块执行了");
    }


    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
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
