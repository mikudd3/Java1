package itheima.java1.d04_methodandarr.method;

/**
 * @project: 设计一个方法用于打印两个数中的较大值
 * @author: mikudd3
 * @version: 1.0
 */
public class TestMethod2 {
    public static void main(String[] args) {
        getMax(10, 20);
    }

    public static void getMax(int a, int b) {
        System.out.println(Math.max(a, b));
    }

}
