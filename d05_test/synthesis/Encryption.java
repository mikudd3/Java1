package itheima.java1.d05_test.synthesis;

import java.util.Scanner;

/**
 * @project: 数字加密
 * 需求:
 * ●某系统的数字密码（大于0)，比如1983，采用加密方式进行传输。
 * 规则如下:
 * 先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
 * @author: mikudd3
 * @version: 1.0
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = input.nextInt();
        //获取数组的长度
        int length = getLength(num);
//        System.out.println(length);

        //创建数组,将输入数字的每一位数放入数组
        int[] arr = new int[length];
        inputArr(arr, num);
//        System.out.println(Arrays.toString(arr));

        String s = encryption(arr);

        System.out.println("加密后数字为：" + s);

    }

    /**
     * 对数字进行加密
     *
     * @param arr
     * @return
     */
    public static String encryption(int[] arr) {
        //先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
        for (int i = 0; i < arr.length; i++) {
            int num = (arr[i] + 5) % 10;
            arr[i] = num;
        }

        return reverse(arr);
    }

    /**
     * 反转数字
     *
     * @param arr
     * @return
     */
    public static String reverse(int[] arr) {
        String str = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            str += arr[i];
        }
        return str;
    }

    /**
     * 将数组放入数组
     *
     * @param arr
     * @param num
     */
    public static void inputArr(int[] arr, int num) {
        //索引
        int index = arr.length - 1;
        while (num != 0) {
            int ge = num % 10;
            num /= 10;
            arr[index] = ge;
            index--;
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
