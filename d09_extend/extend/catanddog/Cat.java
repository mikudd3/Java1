package itheima.java1.d09_extend.extend.catanddog;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
