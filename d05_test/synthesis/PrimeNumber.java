package itheima.java1.d05_test.synthesis;

/**
 * @project: 判断101-200之间有多少个素数，并输出所有素数。
 * @author: mikudd3
 * @version: 1.0
 */
public class PrimeNumber {
    public static void main(String[] args) {
        //计数器
        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i + "是质数");
                count++;
            }
        }
        System.out.println("101-200之间的质数有" + count + "个");
    }
}
