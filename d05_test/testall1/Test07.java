package itheima.java1.d05_test.testall1;

/**
 * @project: 比较两个数组的内容是否相同
 * @author: mikudd3
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        isSame(arr1, arr2);
        isSame(arr1, arr3);
    }

    public static void isSame(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("两个数组的元素不同");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("两个数组的元素不同");
                    return;
                }
            }
            System.out.println("两个数组的内容相同");
        }
    }
}
