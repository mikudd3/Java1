package itheima.java1.d03_if_while_switch.tesyfor;

/**
 * @project: 1000以内的水仙花个数
 * @author: mikudd3
 * @version: 1.0
 */
public class TestFor5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 10 / 10;

            if (i == (a * a * a) + (b * b * b) + (c * c * c)) {
                count++;
            }
        }

        System.out.println("1000以内的水仙花个数为:" + count);
    }
}
