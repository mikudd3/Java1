package itheima.java1.d04_methodandarr.test;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args) {
        //需求：
        //随机数范围：1~100

        //创建对象
        Random r = new Random();
        //生成随机数
        int number = r.nextInt(100) + 1;//1  ~ 100
        System.out.println(number);


        //秘诀
        //用来生成任意数到任意数之间的随机数 7 ~15
        //1.让这个范围头尾都减去一个值，让这个范围从0开始  -7   0~8
        //2.尾巴+1       8 + 1 = 9
        //3.最终的结果，再加上第一步减去的值。

       /* Random r = new Random();
        int number = r.nextInt(9) + 7;// 7 ~ 15
                //   0 ~ 8  + 7
        System.out.println(number);*/

    }
}
