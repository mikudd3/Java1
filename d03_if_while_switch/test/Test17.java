package itheima.java1.d03_if_while_switch.test;


public class Test17 {
    public static void main(String[] args) {
        /*需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/


        //分析：折叠纸张：每一次折叠纸张的厚度都是原先的两倍
        // double a = 0.1;
        // a = a * 2;
        // a *= 2


        //1.定义一个变量用来记录山峰的高度
        double height = 8844430;
        //2.定义一个变量用来记录纸张的初始厚度
        double paper = 0.1;
        //3.定义一个变量用来统计次数
        int count = 0;
        //4.循环折叠纸张，只要纸张的厚度小于山峰的高度，那么循环就继续
        //每折叠一次，统计次数就要++
        //选择while理由：此时我们不知道循环的次数也不知道循环的范围，只知道循环的结束条件，所以用while
        while(paper < height){
            //折叠纸张
            paper = paper * 2;
            //折叠一次，++一次
            count++;
        }
        //当循环结束之后，count记录的值就是折叠的次数
        System.out.println(count);



    }
}
