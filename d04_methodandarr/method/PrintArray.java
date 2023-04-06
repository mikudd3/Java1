package itheima.java1.d04_methodandarr.method;

/**
 * @project: 数组遍历
 * @author: mikudd3
 * @version: 1.0
 */
public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 5, 9};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
