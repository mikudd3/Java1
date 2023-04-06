package itheima.java1.d10_abstract.polymorphic.catanddog;

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

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }
}
