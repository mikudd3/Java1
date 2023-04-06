package itheima.java1.d05_test.synthesis;

import java.util.Scanner;

/**
 * @project: 数字解密
 * * 数字加密反转
 * @author: mikudd3
 * @version: 1.0
 */
public class Decrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入加密后的数字：");
        int num = input.nextInt();
        int length = getLength(num);
        //创建数组
        int[] arr = new int[length];
        //将数字加入数组
        inputArr(arr, num);
        //数字解密
        decrypt(arr);
        //输出数据
        print(arr);
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num);
        }
    }

    /**
     * 解密数字
     *
     * @param arr
     */
    public static void decrypt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10 - 5;
            } else {
                arr[i] = arr[i] - 5;
            }
        }
    }

    /**
     * 将数组放入数组
     *
     * @param arr
     * @param num
     */
    public static void inputArr(int[] arr, int num) {
        //索引
        int index = 0;
        while (num != 0) {
            int ge = num % 10;
            num /= 10;
            arr[index] = ge;
            index++;
        }
    }

    /**
     * 获取数组的长度
     *
     * @param num
     * @return
     */
    public static int getLength(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
