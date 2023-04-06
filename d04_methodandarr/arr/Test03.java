package itheima.java1.d04_methodandarr.arr;

/**
 * @project: 求数组里面的最大值
 * @author: mikudd3
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        //定义最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("数组里面的最大值为：" + max);
    }
}
