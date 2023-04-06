package itheima.java1.d09_extend.extend.catanddog;

/**
 * @project: 动物测试类
 * @author: mikudd3
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("mikudd3",12);
        c.catchMouse();

        Dog d = new Dog("111",3);
        d.lookDoor();
    }
}
