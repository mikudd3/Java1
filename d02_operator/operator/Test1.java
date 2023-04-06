package itheima.java1.d02_operator.operator;

/**
 * @project: 计算乘客数量
 * @author: mikudd3
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //一开始没有乘客
        int count = 0;

        //第一站上去一位乘客
        count++;
        //第二站上去两位乘客，下来一位乘客
        count = count + 2 - 1;

        //第三站上去两位乘客，下来一位乘客
        count = count + 2 - 1;

        //第四站下来一位乘客
        count = count - 1;

        //第五站上去一位乘客
        count ++;

        System.out.println(count);
    }
}
