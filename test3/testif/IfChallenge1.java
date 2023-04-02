package com.lanqiao.javalearn.java1.test3.testif;

import java.util.Scanner;

/**
 * 给景点门票定个价
 *
 * @author mikudd3
 */
public class IfChallenge1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的职业：");
        String job = input.next();
        System.out.println("请输入你入园的月份：");
        int month = input.nextInt();

        //票价
        double fare = 100;

        //如果是学生
        if("学生".equals(job)){
            //如果游客是学生，在淡旺季的基础上再继续打 7 折。
            fare *= 0.7;
            switch (month){
                //每年的 1 月，2 月，6 月，7 月，8 月，12 月为旺季，在原价基础上打 8 折。
                case 1:
                case 2:
                case 7:
                case 8:
                case 12:
                    fare *= 0.8;
                    break;
                //每年的 3 月，4 月，5 月，9 月，10 月，11 月为淡季，在原价基础上打 6 折。
                case 3:
                case 4:
                case 5:
                case 9:
                case 10:
                case 11:
                    fare *= 0.6;
                    break;
            }
        }else if("老师".equals(job)){
            //如果游客是老师，在淡旺季的基础上再继续打 8 折。
            fare *= 0.8;
            switch (month){
                //每年的 1 月，2 月，6 月，7 月，8 月，12 月为旺季，在原价基础上打 8 折。
                case 1:
                case 2:
                case 7:
                case 8:
                case 12:
                    fare *= 0.8;
                    break;
                //每年的 3 月，4 月，5 月，9 月，10 月，11 月为淡季，在原价基础上打 6 折。
                case 3:
                case 4:
                case 5:
                case 9:
                case 10:
                case 11:
                    fare *= 0.6;
                    break;
            }
        }else {
            //其他游客不再继续打折。
            switch (month){
                //每年的 1 月，2 月，6 月，7 月，8 月，12 月为旺季，在原价基础上打 8 折。
                case 1:
                case 2:
                case 7:
                case 8:
                case 12:
                    fare *= 0.8;
                    break;
                //每年的 3 月，4 月，5 月，9 月，10 月，11 月为淡季，在原价基础上打 6 折。
                case 3:
                case 4:
                case 5:
                case 9:
                case 10:
                case 11:
                    fare *= 0.6;
                    break;
            }
        }
        System.out.println("你的门票价格为：" + fare);

    }

}
