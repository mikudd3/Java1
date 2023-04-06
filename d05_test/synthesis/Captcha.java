package itheima.java1.d05_test.synthesis;

import java.util.Random;

/**
 * @project: 定义方法实现随机产生一个5位的验证码
 * 验证码格式:
 * ●长度为5
 * 前四位是大写字母或者小写字母
 * 最后一位是数字
 * @author: mikudd3
 * @version: 1.0
 */
public class Captcha {
    public static void main(String[] args) {
        //前四位是大写字母或者小写字母
        //创建字母并存放
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i <= 25) {
                //小写字母
                chars[i] = (char) (97 + i);
            } else {
                //大写字母
                chars[i] = (char) (65 + i - 26);
            }
        }

        //随机数
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chars.length);
            result += chars[index];
        }

        //最后一位是数字
        result += r.nextInt(10);
        //输出结果
        System.out.println(result);
    }
}
