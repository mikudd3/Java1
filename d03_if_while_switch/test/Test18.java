package itheima.java1.d03_if_while_switch.test;


public class Test18 {
    public static void main(String[] args) {
        /*需求：给你一个整数 x 。
        如果 x 是一个回文整数，打印 true ，否则，返回 false 。
        解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121 是回文，而 123 不是。*/


        //分析：
        //1.定义变量记录整数
        int x = 12345;
        //把x做一个临时存储，用来最后进行判断
        int temp = x;
        //2.定义变量记录最终的结果（反过来的数字）
        int result = 0;
        //3.利用循环从右往左获取x中的数字并拼接到result当中
        //while
        while(x != 0){
            //获取到x最右边的数字
            int ge = x % 10;
            //获取一次数字之后，那么就要把当前最右边的数字给去掉
            x = x / 10;
            //拼接到result当中
            result = result * 10 + ge;
        }
        System.out.println(result == temp);






      /*  //1.如何获取到3
        int ge = x % 10;
        result = result + ge;
        System.out.println(result);

        //2.把十位2拼接到result里面
        int shi = x / 10 % 10;
        result = result * 10 + shi;
        System.out.println(result);//32

        //3.把百位拼接到result里面
        int bai = x / 100 % 10;
        result = result * 10 + bai;
        System.out.println(result);//321*/



    }
}
