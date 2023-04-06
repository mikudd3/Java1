package itheima.java1.d05_test.testall1;

import java.util.Scanner;

/**
 * @project: 评委打分
 * 1.键盘录入成绩
 * 2.去掉最高分和最低分
 * 3.取平均值
 * @author: mikudd3
 * @version: 1.0
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        //录入成绩
        input(arr);
        //求最大值
        int max = getMax(arr);
        //求最小值
        int min = getMin(arr);
        //求和
        int sum = getSum(arr);

        //平均分
        double avg = (sum - max - min) / 4;
        System.out.println("平均分为：" + avg);

    }

    public static void input(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委成绩");
            arr[i] = input.nextInt();
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
        }
        return min;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
