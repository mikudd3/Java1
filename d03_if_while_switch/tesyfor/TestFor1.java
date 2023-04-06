package itheima.java1.d03_if_while_switch.tesyfor;

/**
 * @project: 输出1-5和5-1的数据
 * @author: mikudd3
 * @version: 1.0
 */
public class TestFor1 {
    public static void main(String[] args) {
        System.out.println("1-5的数据为：");
        for(int i = 1;i <= 5;i ++){
            System.out.print(i);
        }
        System.out.println();
        System.out.println("----------------");

        System.out.println("5-1输出：");
        for(int i = 5;i > 0;i --){
            System.out.print(i);
        }
        System.out.println();
    }
}
