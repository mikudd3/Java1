package itheima.java1.studentmgrplus;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCode());
    }


    private static String getCode(){
        //1.创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        //2.要随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            //利用随机索引获取字符
            char c = list.get(index);
            //把随机字符添加到sb当中
            sb.append(c);
        }

        //3.把一个随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);

        //4.如果我们要修改字符串中的内容
        //先把字符串变成字符数组，在数组中修改，然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        //拿着最后一个索引，跟随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        //最大索引指向的元素 跟随机索引指向的元素交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);

    }
}
