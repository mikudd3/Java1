package itheima.java1.d04_methodandarr.test;

public class ArrTest4 {
    public static void main(String[] args) {
        //定义数组求最大值：33,5,22,44,55

        //扩展问题：
        //1.根据求最大值的思路，自己改写一下求最小智
        //2.为什么max要记录为arr[0],默认值不能为0吗？
        //不能写0
        //max的初始化值一定要是数组中的值。
        //3.循环中开始条件一定是0吗？
        //循环的开始条件如果为0，那么第一次循环的时候是自己跟自己比了一下，对结果没有任何影响，但是效率偏低
        //为了提高效率，减少一次循环的次数，循环开始条件可以写1.


        //1.定义数组用来存储5个值
        int[] arr = {33,5,22,44,55};
        //2.定义一个变量max用来存储最大值
        //临时认为0索引的数据是最大的
        int max = arr[0];
        //3.循环获取数组中的每一个元素
        //拿着每一个元素跟max进行比较
        for (int i = 1; i < arr.length; i++) {
            //i 索引  arr[i] 元素
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //4.当循环结束之后，max记录的就是数组中的最大值
        System.out.println(max);//55


    }
}
