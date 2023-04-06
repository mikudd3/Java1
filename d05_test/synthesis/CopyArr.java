package itheima.java1.d05_test.synthesis;

import java.util.Arrays;

/**
 * @project: 把一个数组中的元素复制到另一个新数组中去。
 * @author: mikudd3
 * @version: 1.0
 */
public class CopyArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] copyArr = new int[arr.length];

        System.arraycopy(arr, 0, copyArr, 0, arr.length);

        System.out.println(Arrays.toString(copyArr));
    }
}
