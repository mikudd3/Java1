package com.lanqiao.javalearn.java1.test5.teststringbuffer;

/**
 * @project: 字符串缓存的基本使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestBuffer {
    /**
     * StringBuffer 类的基本使用
     */
    public void method1() {
        // 创建 StringBuffer 对象方式一
        StringBuffer buffer1 = new StringBuffer();//无参
        System.out.println(buffer1.length()); //长度0
        System.out.println(buffer1); //null
        // 创建 StringBuffer 对象方式二
        StringBuffer buffer2 = new StringBuffer("小桃子");//有参
        System.out.println(buffer2.length());//3
        System.out.println(buffer2);//小桃子

        // 进行数据追加操作
        buffer1.append("hello");
        System.out.println(buffer1);//hello
        // 追加的数据一定是放在之前数据的后面
        buffer1.append(buffer2);//hello小桃子
        System.out.println(buffer1);//hello小桃子

        // 进行数据添加操作，根据指定位置，也就是根据索引插入数据
        buffer1.insert(1, 123);//h123ello小桃子
        buffer1.insert(8, '小');//h123ello小小桃子
        System.out.println(buffer1);//h123ello小小桃子

        // 清除字符串缓存中的数据
        // 需要指定开始索引和结束索引
        buffer1.delete(1, 4);//hello小小桃子
        System.out.println(buffer1);//hello小小桃子
        // 清除指定某个字符
        buffer1.deleteCharAt(5);//hello小桃子
        System.out.println(buffer1);//hello小桃子
        // 清空当前字符串缓存
        buffer1.delete(0, buffer1.length() + 1);//null
        System.out.println(buffer1);//null

        // 字符串缓冲区中的数据反向输出
        buffer2.reverse();
        System.out.println(buffer2);//子桃小

    }

    /**
     * String 和 StringBuffer 区别
     */
    public void method2() {
        String s = "aaaa";
        // 获取当前系统时间的毫秒数
        long strstart = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += s;
        }
        // 获取当前循环结束后系统时间的毫秒数
        long strend = System.currentTimeMillis();
        // 完成连接操作后所需要执行的毫秒数
        System.out.println(strend - strstart);

        // 以下采用 StringBuffer 执行操作
        System.out.println("------");
        long bufferstart = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            buffer.append(s);
        }
        long bufferend = System.currentTimeMillis();
        System.out.println(bufferend - bufferstart);
    }

    /**
     * StringBuffer 和 StringBuilder 区别
     */
    public void method3() {
        String s = "aaaa";
        // 以下采用 StringBuffer 执行操作
        System.out.println("------");
        long bufferstart = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            buffer.append(s);
        }
        long bufferend = System.currentTimeMillis();
        System.out.println(bufferend - bufferstart);

        // 以下采用 StringBuiler 执行操作
        System.out.println("------");
        long builderstart = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append(s);
        }
        long builderend = System.currentTimeMillis();
        System.out.println(builderend - builderstart);
    }

    public static void main(String[] args) {
        var tb = new TestBuffer();
        tb.method1();
        tb.method2();
        tb.method3();
    }
}
