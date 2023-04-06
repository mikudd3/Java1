package itheima.java1.d04_methodandarr.method;

import java.util.Scanner;

/**
 * @project: 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
 * @author: mikudd3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9, 10};
        System.out.println("亲输入需要查找的数字:");
        int target = input.nextInt();

        int index = isExist(arr, target);

        if (-1 != index) {
            System.out.println(target + "在数组的下标为：" + index);
        } else {
            System.out.println(target + "不在数组中");
        }

    }

    public static int isExist(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
