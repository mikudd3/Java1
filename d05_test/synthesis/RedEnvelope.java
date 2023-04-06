package itheima.java1.d05_test.synthesis;

import java.util.Random;

/**
 * @project: 抢红包，现金红包，里面有{2，588，888，1000，10000}
 * 模拟抽奖，随机不重复
 * @author: mikudd3
 * @version: 1.0
 */
public class RedEnvelope {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {2, 588, 888, 1000, 10000};
        //抽奖结果
        int[] newArr = new int[arr.length];
        lottery(newArr, arr);
        print(newArr);

    }

    /**
     * 打印数组元素
     *
     * @param arr
     */
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * 抽奖
     *
     * @param newArr
     * @param arr
     */

    public static void lottery(int[] newArr, int[] arr) {
        Random r = new Random();
        for (int i = 0; i < newArr.length; ) {
            //获取随机索引
            int randomNum = r.nextInt(newArr.length);
            //奖项
            int prize = arr[randomNum];
            boolean flag = contains(newArr, prize);
            if (!flag) {
                newArr[i] = prize;
                i++;
            }
        }

    }

    /**
     * 判断该数是否在数组中存在
     *
     * @param arr
     * @param prize
     * @return
     */
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
