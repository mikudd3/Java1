package itheima.java1.d05_test.test;
public class Test2 {
    public static void main(String[] args) {
        //判断 101 ~ 200 之间有多少个素数，并打印所有素数

        //思路一： 2 ~ 99
        //定义变量i ，赋值100
        //判断i是否为质数

        //定义一个变量用来统计有多少个质数
        int count = 0;
        //外循环：遍历101~200这个范围，依次得到这个范围之内的每一个数字
        for (int i = 101; i <= 200; i++) {
            //i 依次表示循环中的每一个数字
            //继续判断i是否为一个质数
            boolean flag = true;
            //内循环:判断当前数字是否为一个质数。
            for (int j = 2; j < i; j++) {
                //j 表示2~99之间的每一个数字
                if(i % j == 0){
                    flag = false;
                    //跳出单层循环，内循环
                    break;
                }
            }
            if(flag){
                System.out.println("当前数字"+i+"是质数");
                count++;
            }
        }

        System.out.println("一共有" + count + "个质数");

       /* int i = 7;
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            //j 表示2~99之间的每一个数字
            if(i % j == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("当前数字是质数");
        }else{
            System.out.println("当前数字不是一个质数");
        }*/
    }
}
