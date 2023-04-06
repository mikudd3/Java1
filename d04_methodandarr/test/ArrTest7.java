package itheima.java1.d04_methodandarr.test;

public class ArrTest7 {
    public static void main(String[] args) {
        /*需求：定义一个数组，将数组中0索引和最大索引出的值进行交换*/

        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        //2.将数组中0索引和最大索引出的值进行交换
        //也是可以利用第三方变量进行交换
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
