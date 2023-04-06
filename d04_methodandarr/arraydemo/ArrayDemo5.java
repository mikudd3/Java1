package itheima.java1.d04_methodandarr.arraydemo;
public class ArrayDemo5 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        //长度：5
        //最小索引：0
        //最大索引：4（数组的长度 - 1）
        System.out.println(arr[2]);


        //小结：
        //索引越界异常
        //原因：访问了不存在的索引
        //避免：索引的范围
        //最小索引：0
        //最大索引：（数组的长度 - 1）
    }
}
