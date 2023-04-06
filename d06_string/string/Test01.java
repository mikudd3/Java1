package itheima.java1.d06_string.string;

import java.util.Scanner;

/**
 * @project: 用户登录
 * 已知用户名和密码，请用程序实现模拟用户登录，总共给三次机会，登录之后给出相应提示
 * @author: mikudd3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        String user = "mikudd3";
        String pwd = "123456";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String inputUser = input.next();
            System.out.println("请输入密码：");
            String inputPwd = input.next();

            if (user.equals(inputUser) && pwd.equals(inputPwd)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("输入错误，你还有" + (2 - i) + "次机会");
            }
        }
    }
}
