package itheima.java1.d03_if_while_switch.ifdemo;

/*
    if(关系表达式){
        语句体;
    }

    if的注意点：
        1.大括号的开头可以另起一行书写，但是建议写在第一行的末尾
        2.在语句体中，如果只有一句代码，大括号可以省略不写。个人建议，大括号还是不要省略
        3.如果对一个布尔类型的变量进行判断，不要用==号，直接把变量写在小括号即可
*/
public class IfDemo2 {
    public static void main(String[] args) {
      /* int number = 20;
       if(number >= 10)
           //int a = 100; //1.定义变量a 2.给变量a赋值为100
           //System.out.println("number大于等于10");

*/

       boolean flag = true;
       if(flag){
           System.out.println("flag的值为true");
       }


    }
}
