package itheima.java1.d10_abstract.innerclass.a02innerclassdemo2;

public class Outer {
    String name;

    private class Inner{
        static int a = 10;
    }


    public Inner getInstance(){
        return new Inner();
    }


}
