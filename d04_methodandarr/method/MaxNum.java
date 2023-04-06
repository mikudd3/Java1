package itheima.java1.d04_methodandarr.method;

/**
 * @project: 获取数组中的最大值
 * @author: mikudd3
 * @version: 1.0
 */
public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 62, 85, 78, 72, 12, 14, 29, 98, 26, 88};
        int max = getMax(arr);
        System.out.println(max);
    }

    /**
     * 获取数组的最大值
     *
     * @param arr
     * @return
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
