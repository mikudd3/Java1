package itheima.java1.d04_methodandarr.method;

/**
 * @project: 定义一个方法用于打印两个数中的较大值
 * @author: mikudd3
 * @version: 1.0
 */
public class TestMethod1 {
    public static void main(String[] args) {
        int max = getMax(10, 20);
        System.out.println(max);
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }
}
