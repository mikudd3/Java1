package itheima.java1.d09_extend.oop_extend.a06oopextendsdemo6;

public class Test {
    public static void main(String[] args) {
        OverseasStudent s = new OverseasStudent();
        s.lunch();
    }
}

class Person {
    public  void eat() {
        System.out.println("吃米饭，吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

//留学生
class OverseasStudent extends Person{
    public void lunch(){
        this.eat();//吃意大利面
        this.drink();//喝凉水

        super.eat();//吃米饭，吃菜
        super.drink();//喝开水
    }

    //应用场景：当父类中方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写。
    //注意：子类中重写的方法上面需要加上@override
    @Override
    public  void eat() {
        System.out.println("吃意大利面");
    }

    @Override
    public void drink() {
        System.out.println("喝凉水");
    }

}




class Student extends Person{

    public void lunch(){
        //先在本类中查看eat和drink方法，就会调用子类的，如果没有，就会调用从父类中继承下来的eat和drink方法
        this.eat();
        this.drink();

        //直接调用父类中的eat和drink方法
        super.eat();
        super.drink();
    }

}
