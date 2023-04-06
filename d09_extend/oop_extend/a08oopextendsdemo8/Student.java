package itheima.java1.d09_extend.oop_extend.a08oopextendsdemo8;

public class Student extends Person{

    public Student(){
        //子类构造方法中隐藏的super()去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }


    public Student(String name,int age){
       super(name,age);
    }


}
