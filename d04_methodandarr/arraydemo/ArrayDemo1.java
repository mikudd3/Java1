package itheima.java1.d04_methodandarr.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //格式：
        //静态初始化
        //完整格式：
        //数据类型 [] 数组名 = new 数据类型[]{元素1，元素2....};
        //简化格式：
        //数据类型 [] 数组名 = {元素1，元素2....};


        //需求1：定义数组存储5个学生的年龄
       int[] arr1 = new int[]{11,12,13,14,15};
        System.out.println(arr1);//[I@776ec8df
         /*int[] arr2 = {11,12,13,14,15};

        //需求2：定义数组存储3个学生的姓名
        String[] arr3 = new String[]{"zhangsan","lisi","wangwu"};
        String[] arr4 = {"zhangsan","lisi","wangwu"};

        //需求3：定义数组存储4个学生的身高 1.93
        double[] arr5 = new double[]{1.93,1.75,1.73,1.81};*/
        //double[] arr6 = {1.93,1.75,1.73,1.81};
        //System.out.println(arr6);//[D@776ec8df  地址值

        //扩展：
        //解释一下地址值的格式含义  [D@776ec8df
        //[ ：表示当前是一个数组
        //D：表示当前数组里面的元素都是double类型的
        //@：表示一个间隔符号。（固定格式）
        //776ec8df：才是数组真正的地址值，（十六进制）
        //平时我们习惯性的会把这个整体叫做数组的地址值。



    }
}
