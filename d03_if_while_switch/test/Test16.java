package itheima.java1.d03_if_while_switch.test;


import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
       /* 需求：键盘录入两个数字，表示一个范围。
        统计这个范围中。
        既能被3整除，又能被5整除数字有多少个？*/

        //分析：
        //1.键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围的结束");
        int end = sc.nextInt();

        //统计变量
        //简单理解：统计符合要求的数字的个数
        int count = 0;

        //2.利用循环获取这个范围中的每一个数字
        //开始条件：start
        //结束条件：end
        for (int i = start; i <= end; i++) {
            //3.对每一个数字进行判断，统计有多少个满足要求的数字
            if (i % 3 == 0 && i % 5 == 0) {
               // System.out.println(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
