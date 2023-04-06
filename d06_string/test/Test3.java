package itheima.java1.d06_string.test;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容

        //1.键盘输入任意字符串
        String str = "abcdefg";


        //2.打乱里面的内容
        //修改字符串里面的内容：
        //1.subString
        //2.变成字符数组
        char[] arr = str.toCharArray();//['a','b','c','d','e','f','g']

        //3.打乱数组里面的内容
        //从0索引开始，跟一个随机索引进行位置的交换
        //当数组里面的每一个元素都跟一个随机索引进行交换完毕之后，那么内容就打乱了

        //4.把字符数组再变回字符串
        String result = new String(arr);

        System.out.println(result);
    }
}
