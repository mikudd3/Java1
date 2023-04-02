package com.lanqiao.javalearn.java1.test2.type;

/**
 * 字符串 String 的使用
 *
 * @author mikudd3
 */
public class TestString {
    public static void main(String[] args) {
        // 字符串变量 str1 所赋值的就是 0 个字符
        String str1 = "";
        System.out.println(str1);
        // 字符串变量 str2 所赋值的就是多个字符
        String str2 = "HelloWorld";
        System.out.println(str2);
        // 以下两行语句比较有代表性，同学们可以写完，运行代码看看是什么结果！
        System.out.println(1 + 1);
        System.out.println("1 + 1");
        // 声明了两个字符串变量
        String str3 = "Hello";
        String str4 = "World";
        // 将字符串变量 str3 连接变量 str4 然后进行打印输出，也就是将变量str3 和 str4 做拼接操作，所以语句输出的结果和打印输出变量 str2 的结果是一样的，仔细看运行结果。
        System.out.println(str3 + str4);
        // 声明了 int 类型变量
        int a = 100;
        // 将变量 str3 连接变量 a ，同理变量 str3 和 a 拼接后，这时打印输出的是字符串类型数据，也就是说任何数据和字符串进行连接后，都将默认转换为字符串。
        System.out.println(str3 + a);
    }
}
