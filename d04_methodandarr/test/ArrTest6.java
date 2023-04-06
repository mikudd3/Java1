package itheima.java1.d04_methodandarr.test;

public class ArrTest6 {
    public static void main(String[] args) {
        /*需求：定义两个变量，交换两个变量记录的值*/

        int a = 10;
        int b = 20;

      /*  //把变量b的值。赋值给了变量a。那么变量a原来的值就被覆盖了
        a = b;//a = 20 b = 20

        //把变量a的值，赋值给了变量b。
        b = a;//a = 20 b = 20

        System.out.println(a);//20
        System.out.println(b);//20*/

        //定义一个临时的第三方变量
        //把变量a的值，赋值给了temp
        int temp = a;
        //把变量b的值，赋值给了a。那么变量a原来记录的值就被覆盖了
        a = b;
        //就是把变量a原来的值，赋值给了变量b
        b = temp;
        System.out.println(a);//20
        System.out.println(b);//10



    }
}
