package itheima.java1.d07_oneclass.testclass.phone;

/**
 * @project: 手机测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class PoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();

        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用成员方法
        p.call();
        p.sendMessage();
    }
}
