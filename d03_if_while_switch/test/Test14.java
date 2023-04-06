package itheima.java1.d03_if_while_switch.test;


public class Test14 {
    public static void main(String[] args) {
      /*  需求：在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环。
        比如：求1-5之间的和*/


        //分析：
        //1.循环1~5得到里面的每一个数字
        //开始条件：1
        //结束条件：5

        //用来进行累加的
        int sum = 0;
        for(int i = 1; i <= 100 ; i++){
            //扩展小点：
            //1.求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效
            //2.如果我们把变量定义在循环的里面，那么当前变量只能在本次循环中有效。
            //当本次循环结束之后，变量就会从内存中消失。
            //第二次循环开始的时候，又会重新定义一个新的变量。
            //结论：如果以后我们要写累加求和的变量。可以把变量定义在循环的外面。
            //int sum = 0;
            //System.out.println(i);
            //可以把得到的每一个数字累加到变量sum当中
            sum = sum + i;// sum += i;
            //System.out.println(sum);
        }

        //当循环结束之后，表示已经把1~5累加到变量sum当中了
        //System.out.println(sum);


    }
}
