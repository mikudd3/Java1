package itheima.java1.d04_methodandarr.test;

public class LoopTest4 {
    public static void main(String[] args) {
        // 100000
        // 2 ~ 99999
        //循环的次数：将近10万次

        //推荐一个简化的思路
        //81
        //1 * 81
        //3 * 27
        //9 * 9


        //以81的平方根9，为中心
        //而且假设 a * b = 81
        //那么a和b中，其中有一个必定是小于等于9的。
        //另一个是大于等于9的。

        //假设，都是大于9 --- 9.1 * 9.1 > 81
        //假设，都是小于9 --- 8.9 * 8.9 < 81
        //其中一个数字一定是小于等于平方根
        //另外一个数字一定是大于等于平方根

        int number = 100;
        //如果这个范围之内，所有的数字都不能被number整除
        //那么number就一定是一个质数。
       /* for (int i = 2; i <= number的平方根; i++) {

        }*/


    }
}
