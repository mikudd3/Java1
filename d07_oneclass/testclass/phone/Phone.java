package itheima.java1.d07_oneclass.testclass.phone;

/**
 * @project: 手机类
 * @author: mikudd3
 * @version: 1.0
 */
public class Phone {
    String brand;   //品牌
    int price;  //价格

    //成员方法
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发信息");
    }
}
