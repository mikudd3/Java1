package itheima.java1.d07_oneclass.all.test4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入的两套体系不能混用的
        //弊端：先用nextInt，再用nextLine会导致下面的nextLine接受不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();//123 + 回车
        System.out.println(num);//123
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        System.out.println(line);//

    }
}
