package itheima.java1.d05_test.testall1;

import java.util.Arrays;

/**
 * @project: 反转数组
 * @author: mikudd3
 * @version: 1.0
 */
public class Test09 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("反转前：" + Arrays.toString(arr));
        reverse(arr);
        System.out.println("反转后：" + Arrays.toString(arr));

    }

    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
