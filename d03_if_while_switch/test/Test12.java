package itheima.java1.d03_if_while_switch.test;


public class Test12 {
    public static void main(String[] args) {
        //需求1：打印1-5

        //分析：
        //开始条件：1
        //结束条件：5
        for (int i = 1 ; i <= 5; i++){
            //第一次循环：i = 1
            //第二次循环：i = 2
            //i : 1 2 3 4 5
            System.out.println(i);
        }



        //需求2：打印5-1
        //分析：
        //开始条件: 5
        //结束条件：1
        for(int i = 5 ; i >= 1 ; i--){
            System.out.println(i);
        }



    }
}
