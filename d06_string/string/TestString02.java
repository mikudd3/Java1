package itheima.java1.d06_string.string;

import java.util.Scanner;

/**
 * @project: 转换罗马数字
 * @author: mikudd3
 * @version: 1.0
 */
public class TestString02 {
    public static void main(String[] args) {
        //键盘录入字符串
        String str;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个字符串");
            str = input.next();
            if (checkStr(str)) {
                break;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
//        System.out.println(str);
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = Integer.parseInt(String.valueOf(c));
            s += changeLuoMa(num);
        }

        System.out.println(s);

    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String changeLuoMa(int number) {
        String str = "";
        switch (number) {
            case 0 -> str = "";
            case 1 -> str = "Ⅰ";
            case 2 -> str = "Ⅱ";
            case 3 -> str = "Ⅲ";
            case 4 -> str = "Ⅳ";
            case 5 -> str = "Ⅴ";
            case 6 -> str = "Ⅵ";
            case 7 -> str = "Ⅶ";
            case 8 -> str = "Ⅷ";
            case 9 -> str = "Ⅸ";
            default -> str = " ";
        }
        return str;
    }
}
