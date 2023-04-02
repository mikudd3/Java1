package com.lanqiao.javalearn.java1.test8.testinteger;

import java.util.Scanner;

/**
 * @project:身份证号码尾号合法性校验
 * @author :mikudd3
 */
public class CheckId {
    /***
     *
     * @param id
     * @return
     */
    public static boolean check(String id){

        char[] chars = id.toCharArray();
        //系数矩阵
        int[] idNum = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};

        //将前面的身份证号码 17 位数分别乘以不同的系数。
        // 从第一位到第十七位的系数分别为：7、9、10、5、8、4、2、1、6、3、7、9、10、5、8、4、2。

        //17位数之和
        int sum = 0;
        for (int i = 0; i < 17; i++) {

            //转为字符串
            String s = String.valueOf(chars[i]);

            //取数字，乘对应系数，并求和
            sum +=  Integer.parseInt(s) * idNum[i];

        }

        //再使用求和结果除以 11 得到余数。
        int remainder = sum % 11;

        //判断返回值
        int remakeNum = checkSwitch(remainder);

        //如果大于10，表示为字符
        if((int) 'X' == remakeNum){
            chars[17] = 'X';
        }else{
            //先转为字符串
            String s = String.valueOf(remakeNum);
            //再转为字符
            char c = s.charAt(0);
            chars[17] = c;
        }

        //将字符数组重新转为字符串
        String remakeStr = String.valueOf(chars);

        //判断经过转换后的字符串是否与输入的字符串相等
        return remakeStr.equals(id);
    }

    /***
     *
     * @param remainder
     * @return
     */
    private static int checkSwitch(int remainder){
        int num = 0;

        //由于是除以 11 所以余数只可能有 0、1、2、3、4、5、6、7、8、9、10 这 11 个数字。
        // 其分别对应的最后一位身份证的号码为 1、0、X、9、8、7、6、5、4、3、2。
        switch (remainder){
            case 0 -> num = 1;
            case 1 -> num = 0;
            case 2 -> num = (int) 'X';
            case 3 -> num = 9;
            case 4 -> num = 8;
            case 5 -> num = 7;
            case 6 -> num = 6;
            case 7 -> num = 5;
            case 8 -> num = 4;
            case 9 -> num = 3;
            case 10 -> num = 2;
        }
        return num;
    }

    public static void main(String[] args) {
        //输入
        Scanner input = new Scanner(System.in);

        //输入身份证
        System.out.println("请输入一个身份证号码（如果尾号为X，请输入大写X）：");
        String id = input.next();

        //检测身份证是否合格
        if(check(id)){
            System.out.println("合法尾号");
        }else{
            System.out.println("非法尾号");
        }

    }
}
