package itheima.java1.d03_if_while_switch.test;


import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
         /* 需求：键盘录入星期数，输出工作日、休息日。
        (1-5) 工作日，(6-7)休息日。*/


        //分析：
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数表示星期");
        int week = sc.nextInt();
        //2.利用switch语句来进行选择
        switch (week){
            case 1,2,3,4,5 ->  System.out.println("工作日");
            case 6,7 ->  System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }


    }
}
