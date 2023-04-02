package com.lanqiao.javalearn.java1.test5.teststring;

/**
 * @project: String 类常用方法的基本使用
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStringMethod {
    /**
     * 返回字符串新对象的方法
     */
    public void method1() {
        // 声明一个字符串 s
        String s = "    my name is Peaches    ";
        // 通过 concat 方法进行字符串连接操作
        System.out.println(s.concat("I like ").concat("Java"));
        // 通过 + 也可以实现字符串连接操作
        System.out.println(s + "I like " + "Spring");
        // 将字符串 s 全部转化为大写
        System.out.println(s.toUpperCase());
        // 通过 replace 方法进行替换操作，可以按字符进行替换，也可以按字符串进行替换
        System.out.println(s.replace('a', 'J'));
        System.out.println(s.replace("am", "test"));
        // 通过 substring 方法进行截取操作，按指定的索引进行操作
        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 10));
        // 通过 trim 方法进行取消前后空格
        System.out.println(s.trim());
        // 打印输出字符串 s
        System.out.println(s);
    }

    /**
     * 字符串查找方法
     */
    public void method2() {
        // 声明字符串 s
        String s = "TestStringMethod.java";
        // 在指定字符串中查找前后缀是否匹配，返回 boolean 值。
        System.out.println(s.startsWith("Test"));
        System.out.println(s.endsWith(".java"));
        // 在指定字符串中查找是否包含，返回 boolean 值。
        System.out.println(s.contains("str"));
        // 在指定字符串中获取指定字符的索引值。
        // 查找 . 索引值第一个和最后一个的值是一样的。
        System.out.println(s.indexOf('.'));
        System.out.println(s.lastIndexOf('.'));
    }

    /**
     * 字符串比较方法
     */
    public void method3() {
        // 声明字符串 s
        String s = "Java";
        // 当参数为 null 时，不进行值比较操作，与 null 值无须比较，直接返回 false。
        System.out.println(s.equals(null));
        // 在字符串比较操作时，我们也会建议这样书写
        System.out.println("Java".equals(s));
        System.out.println("".equals(s));

        // 当应用程序中询问是否继续操作，会涉及提示 yes or no ?
        // 一般这种情况下，我们都是采用忽略大小写的方式进行比较
        String msg = "YES";
        System.out.println("yes".equalsIgnoreCase(msg) ? "继续前进" : "game over");

        // 按提取的字符值进行计算，当提取的字符值一致时，按照字符串长度进行计算
        System.out.println("a".compareTo("a"));
        System.out.println("aa".compareTo("ab"));
        System.out.println("ba".compareTo("aa"));
        System.out.println("aa".compareTo("aaaa"));

    }

    /**
     * 字符串其他方法
     */
    public void method4() {
        // 通过代码分析 compareTo 方法的调用过程
        // 首先获取需要比较的两个字符串长度，按最小长度来进行字符提取操作
        // 按最小长度提取的的字符都相等时，就按照字符串长度进行计算 this.length()-anotherString.length()
        // 否则就按照 this.charAt(k)-anotherString.charAt(k)
        // "a".compareTo("a")，字符值相等，执行长度计算 1 - 1 = 0
        System.out.println("a".length() - "a".length());
        // "aa".compareTo("ab")，第二个字符值不等，执行 'a' - 'b' 就是 char 隐式转换为 int，97 - 98 = -1
        System.out.println("aa".charAt(1) - "ab".charAt(1));
        // "ba".compareTo("aa")，第一个字符值不等，执行 'b' - 'a', 98 - 97 = 1
        System.out.println("ba".charAt(0) - "aa".charAt(0));
        // "aa".compareTo("aaaa")，最小长度而 2 ，索引 0 和 1 的字符值都相等，执行长度计算 2 - 4 = -2
        System.out.println("aa".length() - "aaaa".length());

        // 声明一个 int 类型 i
        int i = 100;
        // 要让整型 10 变成字符串 10，最简单的方式是 i + ""，那么结果就是字符串 10，而这种方式效率很低，不建议使用，特别是在企业项目中。
        // 建议采用 String 提供的静态方法 valueOf 进行处理。
        String s = String.valueOf(i);
        System.out.println(s);
        s = String.valueOf(45.6);
        System.out.println(s);
        s = String.valueOf(new char[]{'x', 'y', 'z'});
        System.out.println(s);
    }

    public static void main(String[] args) {
        var tsm = new TestStringMethod();
        tsm.method1();
    }
}
