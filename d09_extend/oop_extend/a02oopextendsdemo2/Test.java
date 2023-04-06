package itheima.java1.d09_extend.oop_extend.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        //利用空参构造创建子类对象
        Zi z1 = new Zi();

        //利用带参构造创建子类对象
        //Zi z2 = new Zi("zhangsan",23);
    }
}


class Fu{
    String name;
    int age;

    public Fu(){}
    public Fu(String name,int age){
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu{

    //如果一个类中没有构造方法，虚拟机会自动的给你添加一个默认的空参构造

}
