package itheima.java1.d04_methodandarr.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数 x ，判断该整数是否为一个质数。

       //质数：
        //如果一个整数只能被1和本身整除，那么这个数就是质数。否则这个数叫做合数
        //7 = 1 * 7 质数
        //8 = 1 * 8  2 * 4 合数


        //分析：
        //1.键盘录入一个正整数
        //number
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();//9

        //定义一个变量，表示标记
        //标记着number是否为一个质数
        //true： 是一个质数
        //false : 不是一个质数

        //表示最初就认为number是一个质数
        boolean flag = true;


        //2.判断
        //写一个循环，从2开始判断，一直判断到number-1为止
        //看这个范围之内，有没有数字可以被number整除
        for (int i = 2; i < number; i++) {
            //i 依次表示这个范围之内的每一个数字
            //看number是否能被i整除就可以了
            if(number % i == 0){// 9 % 2 = 1
                flag = false;
                //System.out.println(number + "不是一个质数");
                break;
            }/*else{
                System.out.println(number + "是一个质数");
            }*/
        }

        //只有当这个循环结束了，表示这个范围之内所有的数字都判断完毕了
        //此时才能断定number是一个质数
        if(flag){
            System.out.println(number + "是一个质数");
        }else{
            System.out.println(number + "不是一个质数");
        }

    }
}
