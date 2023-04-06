package itheima.java1.d06_string.string;

/**
 * @project: 拼接字符串
 * 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
 * @author: mikudd3
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String s = append(arr);
        System.out.println("拼接后的字符串为：" + s);
    }

    public static String append(int[] arr) {
        String s = "[";

        for (int i = 0; i < arr.length - 1; i++) {
            s += arr[i] + ",";
        }

        return s + arr[arr.length - 1] + "]";
    }
}
