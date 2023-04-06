package itheima.java1.d06_string.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s = s + "abc";
        }
        System.out.println(s);
    }
}
