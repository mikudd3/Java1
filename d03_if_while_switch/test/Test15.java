package itheima.java1.d03_if_while_switch.test;


public class Test15 {
    public static void main(String[] args) {
        /*需求：在实际开发中，如果要获取一个范围中的每一个数据时，会用到循环。
        但是此时，大多情况下，不会获取所有的数据，而是获取其中符合要求的数据。
        此时就需要循环和其他语句结合使用了。
        比如：求1-100之间的偶数和*/



        //分析：
        //1.获取1 ~100之间的每个数
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //2.累加求和（先判断，再求和）
            if(i % 2 == 0){
                sum = sum + i;
            }
        }

        //打印sum
        System.out.println(sum);


    }
}
