package itheima.java1.d05_test.testall1;

/**
 * @project: 数组元素求和
 * 求和元素个位、十位都不能是7，并且是偶数
 * @author: mikudd3
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210,};
        System.out.println("和为：" + method(arr));
    }

    public static int method(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0 && num % 10 != 7 && num / 10 % 10 != 7) {
                sum += num;
            }
        }
        return sum;
    }
}
