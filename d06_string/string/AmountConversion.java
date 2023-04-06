package itheima.java1.d06_string.string;

import java.util.Scanner;

/**
 * @project: 金额转换
 * @author: mikudd3
 * @version: 1.0
 */
public class AmountConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入金额：");
        int money = input.nextInt();
        String s = getStringNumber(money);
        //要补的零的个数
        int count = 7 - s.length();
        for (int i = 0; i < count; i++) {
            s = "零" + s;
        }
//        System.out.println(s);

        //插入
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            System.out.print(arr[i]);

        }
    }

    /**
     * 转为汉字数字
     *
     * @param money
     * @return
     */
    public static String getStringNumber(int money) {
        String s = "";
        while (money != 0) {
            s += getCapitalNumber(money % 10);
            money /= 10;
        }
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
//        System.out.println(s);
        return sb.toString();
    }


    /**
     * 根据输入索引返回对应字符
     *
     * @param number
     * @return
     */
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
