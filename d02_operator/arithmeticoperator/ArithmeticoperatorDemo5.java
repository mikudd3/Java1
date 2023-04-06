package itheima.java1.d02_operator.arithmeticoperator;

public class ArithmeticoperatorDemo5 {
    public static void main(String[] args) {
        //++ 和 --
        int a = 10;
        //表示把变量a里面的值+1
        a++;
        System.out.println(a);//11
        //表示把变量a里面的值+1
        ++a;
        System.out.println(a);//12
        //表示把变量a里面的值-1
        a--;
        System.out.println(a);//11
        //表示把变量a里面的值-1
        --a;
        System.out.println(a);//10


        int c = 10;
        int d = 10;
        boolean b = ++c < 5 && ++d < 5;
        System.out.println(c);
        System.out.println(d);
    }
}
