package itheima.java1.d04_methodandarr.arr;

import java.util.Random;

/**
 * @project: 打乱数组中的数据
 * 需求:定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
 * @author: mikudd3
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        //随机数
        Random r = new Random();
        //创建数组
        int[] arr = {1, 2, 3, 4, 5};

        //打乱数组
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }

        //打印数组
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
