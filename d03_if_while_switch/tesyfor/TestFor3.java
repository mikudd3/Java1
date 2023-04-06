package itheima.java1.d03_if_while_switch.tesyfor;

/**
 * @project: 求100之内的偶数和
 * @author: mikudd3
 * @version: 1.0
 */
public class TestFor3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2;i <= 100;i += 2){
            sum += i;
        }

        System.out.println("100之内的偶数和为：" + sum);
    }
}
