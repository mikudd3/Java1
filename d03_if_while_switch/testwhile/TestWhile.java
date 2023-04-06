package itheima.java1.d03_if_while_switch.testwhile;

/**
 * @project: 折叠珠穆朗玛峰
 * 需求:世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸
 * 它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 * @author: mikudd3
 * @version: 1.0
 */
public class TestWhile {
    public static void main(String[] args) {
        double paper = 0.1;
        int count = 0;
        while (paper <= 8844430) {
            paper *= 2;
            count++;
        }

        System.out.println("超过珠穆朗玛峰需要折叠" + count + "次");
    }
}
