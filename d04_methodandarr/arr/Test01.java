package itheima.java1.d04_methodandarr.arr;

/**
 * @project: 定义一个数组，存储1,2,3,4,5,6,7,8,9,10
 * 遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
 * 心
 * @author: mikudd3
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int count = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                count++;
            }
        }

        System.out.println("数组内能被3整除的数字有" + count + "个");
    }
}
