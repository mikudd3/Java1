package itheima.java1.d05_test.testall1;

import java.util.Scanner;

/**
 * @project: 查找，键盘输入元素，查找元素在数组的下标位置
 * @author: mikudd3
 * @version: 1.0
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("请输入要查找的元素;");
        int target = input.nextInt();
        int index = findNum(arr, target);
        if (-1 == index) {
            System.out.println("该元素不在数组");
        } else {
            System.out.println(target + "元素在数组的下标为：" + index);
        }
    }

    public static int findNum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
