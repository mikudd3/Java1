package itheima.java1.d04_methodandarr.arr;

/**
 * @project: 交换数组中的数据
 * 需求:定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
 * 交换前:1,2,3,4,5
 * 交换后:5,2,3,4,1
 * @author: mikudd3
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {77, 47, 89, 36, 40, 27, 62, 22, 69, 57};
        //左指针
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
