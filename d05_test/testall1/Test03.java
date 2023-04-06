package itheima.java1.d05_test.testall1;

/**
 * @project: 逢7过，输出100以内含7或者是7的倍数
 * @author: mikudd3
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        for (int i = 1; i < 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
