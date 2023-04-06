package itheima.java1.d03_if_while_switch.tesyfor;

/**
 * @project: 水仙花数
 * @author: mikudd3
 * @version: 1.0
 */
public class TestFor4 {
    public static void main(String[] args) {
        System.out.println("1000以内的水仙花数为：");
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 10 / 10;

            if (i == (a * a * a) + (b * b * b) + (c * c * c)) {
                System.out.print(i + "  ");
            }
        }

    }
}
