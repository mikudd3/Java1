package com.lanqiao.javalearn.java1.test5.teststring;

/**
 * @project: string 的基本使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestString {
    /**
     * 采用不同的构造方法创建 String 对象
     */
    public void method1() {
        // public String() API 中提供的无参构造方法
        String s1 = new String();

        System.out.println(s1);

        // public String(char[] value) API 中提供的带参构造方法
        String s2 = new String(new char[]{'a', 'b', 'c', 'd', 'e'});

        System.out.println(s2);

        /* public String(char[] value, int offset, int count)
         * offset 开始下标
         * count 提取长度
         */
        String s3 = new String(new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 3);

        System.out.println(s3);
        // public String(String original) API 中提供的带参构造方法
        String s4 = new String("mikudd3");
        System.out.println(s4);


    }

    /**
     * 不同方式创建 String 对象进行比较
     */
    public void method2() {
        // s1 和 s2 打印输出的结果看起来是一样的，但是指向的地址空间却是不一样的。
        String s1 = new String();

        String s2 = "";

        // s3 未申请地址空间，所以打印输出的是 null，null 不是字符串常量值。
        // null 也是 String 默认初始值
        String s3 = null;

        // s4 使用 new 申请新的地址空间
        String s4 = new String("mikudd3");

        // s5 和 s6 指向的是同一个地址空间。
        String s5 = "mikudd3";
        String s6 = "mikudd3";

        // 标准输出查看结果
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println(s1 == s2);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
    }

    public void method3() {
        // 不断重新赋值之后，之前的字符串常量值，就无法访问了。
        // 没有名字的指向，这块申请的空间就属于游离状态，之后等到 CPU 空闲时 GC 进行释放处理。
        String name = "mikudd3";

        name = "mikudd2";
        name = "mikudd1";

        // String 的基本使用
        String a = "ja";
        String b = "va";
        String c = "ja" + "va";
        String d = a + b;
        String e = c;
        String f = "java";

        // 字符串 ja 连接上 字符串 va ，然后才申请空间，赋值给 c，就等价于 f = "java"，所以 c == f 结果为 true
        System.out.println(c == f);
        // d = a + b，a 需要申请新的空间，b需要申请新的空间，当赋值给 d 时，还是需要申请新的空间，所以 d == f 结果为 false
        System.out.println(d == f);
        // e = c，把 c 赋值给 e，对于引用类型而言，那就是 c 和 e 指向同一个空间，所以 c == e 结果肯定为 true
        System.out.println(c == e);
        // d 和 e 指向的空间时不一致的，所以 d == e 结果为 false
        System.out.println(d == e);
        // c == f 为 true，c == e 为 true，所以 f == e 肯定为 true
        System.out.println(f == e);
    }

    /**
     * main方法
     *
     * @param args
     */
    public static void main(String[] args) {
        var ts = new TestString();
        ts.method1();
        ts.method2();
        ts.method3();
    }
}
