package itheima.java1.d09_extend.extend.catanddog;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDoor() {
        System.out.println("狗看门");
    }
}
