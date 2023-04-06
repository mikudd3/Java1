package itheima.java1.d04_methodandarr.method;

/**
 * @project: 使用方法重载思想，设计比较两个整数是否相同的方法，兼容全整数类型
 * @author: mikudd3
 * @version: 1.0
 */
public class TestMethod3 {
    public static void main(String[] args) {
        //byte
        byte a1 = 127;
        byte b1 = 127;
        System.out.println(compare(a1, b1));
        short a2 = 128;
        short b2 = 128;
        System.out.println(compare(a2, b2));

        System.out.println(compare(1000, 100));

        System.out.println(compare(1l, 1l));


    }

    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}
