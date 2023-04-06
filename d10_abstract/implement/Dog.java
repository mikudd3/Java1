package itheima.java1.d10_abstract.implement;


/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class Dog extends Animal implements Jumping {
    @Override
    void eat() {
        System.out.println("狗吃饭");
    }

    @Override
    public void jump() {
        System.out.println("狗跳高");
    }
}
