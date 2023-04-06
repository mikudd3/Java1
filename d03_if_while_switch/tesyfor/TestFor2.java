package itheima.java1.d03_if_while_switch.tesyfor;

/**
 * @project: 求1-5的和
 * @author: mikudd3
 * @version: 1.0
 */
public class TestFor2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1-5的和为：" + sum);
    }
}
