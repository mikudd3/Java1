package itheima.java1.d10_abstract.implement.a05interfacedemo5;

public class BasketballSporter extends Sporter {

    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }
}
