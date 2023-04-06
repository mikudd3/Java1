package itheima.java1.d07_oneclass.testclass.role;

/**
 * @project: 文字版格斗游戏测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestRole {
    public static void main(String[] args) {

        //创建角色
        Role r1 = new Role("张三", 100);
        Role r2 = new Role("李四", 100);

        //循环对抗
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }
        }
    }
}
