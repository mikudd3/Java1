package itheima.java1.d05_test.testall1;

/**
 * @project: 百钱百鸡
 * 公鸡1.5，母鸡1.3，3小鸡值1，问100钱买一百只鸡，公鸡，母鸡，小鸡各多少个
 * @author: mikudd3
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("公鸡：" + x + " ,母鸡：" + y + " ,小鸡：" + z);
                }
            }
        }
    }
}
