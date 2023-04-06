package itheima.java1.d04_methodandarr.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*需求：键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根 。
        结果只保留整数部分 ，小数部分将被舍去 。*/


        //分析：
        //平方根   16的平方根4
        //         4的平方根2


        // 10
        // 1 * 1 = 1 < 10
        // 2 * 2 = 4 < 10
        // 3 * 3 = 9 < 10
        // 4 * 4 = 16 > 10
        //推断：10的平方根是在3~4之间。


        // 20
        // 1 * 1 = 1 < 20
        // 2 * 2 = 4 < 20
        // 3 * 3 = 9 < 20
        // 4 * 4 = 16 < 20
        // 5 * 5 = 25 > 20
        //推断：20的平方根是在4~5之间。


        //在代码当中
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        //如果小于的，那么继续往后判断
        //如果相等，那么当前数字就是平方根
        //如果大于的，那么前一个数字就是平方跟的整数部分


        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        //2.从1开始循环判断
        //开始：1 结束: number
        for (int i = 1; i <= number; i++) {
            //用i * i 再跟number进行比较
            if(i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                //一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率。
                break;
            }else if(i * i > number){
                System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }



    }
}
