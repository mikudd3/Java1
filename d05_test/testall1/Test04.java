package itheima.java1.d05_test.testall1;

/**
 * @project: 不死神兔
 * @author: mikudd3
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        int sum = getNum(19);
        System.out.println("第20个月的兔子数量为：" + sum);
    }

    public static int getNum(int month) {
        int pre = 0;
        int after = 0;
        int result = 1;
        for (int i = 1; i <= month; i++) {
            pre = after;
            after = result;
            result = pre + after;

        }
        return result;
    }
}
