package itheima.java1.d02_operator.operator;

/**
 * @project: 分析:
 * * 定义两个变量用于保存老虎的体重，单位为kg，这里仅仅体现数值即可。
 * * int weight1 = 180;
 * * int weight2 = 200;
 * * 用三元运算符实现老虎体重的判断，体重相同，返回true，否则，返回false。
 * * (weight1 == weight2) ? true : false;
 * * ③输出结果
 * @author: mikudd3
 * @version: 1.0
 */
public class TwoTiger {
    public static void main(String[] args) {
        int weight1 = 180;
        int weight2 = 200;

        System.out.println(weight1 == weight2 ? true : false);
    }
}
