package itheima.java1.d04_methodandarr.method;

import java.util.Arrays;

/**
 * @project: 复制数组
 * 需求:
 * 定义一个方法copyOfRange(int[] arr,int from, int to)
 * 功能:
 * 将数组arr中从索引from (包含from）开始。
 * 到索引to结束（不包含to)的元素复制到新数组中，将新数组返回。
 * 心
 * @author: mikudd3
 * @version: 1.0
 */
public class CopyArr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9, 10};

        int[] arr1 = copyOfRange(arr, 2, 5);

        System.out.println(Arrays.toString(arr1));
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        //创建临时数组
        int[] temp = new int[to - from];

        for (int i = 0; from < to; from++, i++) {
            temp[i] = arr[from];
        }

        return temp;
    }
}
