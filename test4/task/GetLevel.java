package com.lanqiao.javalearn.java1.test4.task;

/**
 * project 写一个getLevel方法，
 * 实现获取1-6的随机数，
 * 并返回这个随机数。在主调方法中，接住这个随机数，
 * 如果随机数是1，打印输出“恭喜你获得一等奖”；
 * 如果随机数是2，打印输出“恭喜你获得二等奖”；
 * 依此类推。
 * @author mikudd3
 */
public class GetLevel {
    /**
     * 获取成绩等级
     * @return
     */
    public static int getLevel(){
        //获取随机数
        return (int)(Math.random() * 6 + 1);
    }

    public static void main(String[] args) {
        int num = getLevel();
        System.out.println(num);
        switch (num){
            case 1 -> System.out.println("恭喜你获得一等奖");
            case 2 -> System.out.println("恭喜你获得二等奖");
            case 3 -> System.out.println("恭喜你获得三等奖");
            case 4 -> System.out.println("恭喜你获得四等奖");
            case 5 -> System.out.println("恭喜你获得五等奖");
            case 6 -> System.out.println("恭喜你获得六等奖");
        }
    }

}
