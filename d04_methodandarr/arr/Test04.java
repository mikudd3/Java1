package itheima.java1.d04_methodandarr.arr;

import java.util.Random;

/**
 * @project: 遍历数组求和
 * 需求:生成10个1~100之间的随机数存入数组。
 * 1）求出所有数据的和
 * 2）求所有数据的平均数
 * 3）统计有多少个数据比平均值小
 * @author: mikudd3
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //随机数
        Random r = new Random();

        //存入数组
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        //求出所有数据的和
        int sum = arr[0];
        for (int i = 1; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println("和为：" + sum);

        //求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("平均值为：" + avg);

        //统计有多少个数据比平均值小
        //计数器
        int count = 0;
        for (int num : arr) {
            if (num > avg) {
                count++;
            }
        }
        System.out.println("大于平均数的数有" + count + "个");
    }
}
