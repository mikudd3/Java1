package itheima.java1.d07_oneclass.testclass.role;

import java.util.Random;

/**
 * @project: 英雄类
 * @author: mikudd3
 * @version: 1.0
 */
public class Role {
    private String name;    //姓名
    private int blood;      //血量

    public Role() {
    }

    public void attack(Role r) {
        //随机数获取伤害
        Random random = new Random();
        //随机伤害0-20
        int hurt = random.nextInt(20);

        //剩余血量
        int remainBlood = r.getBlood() - hurt;

        remainBlood = Math.max(remainBlood, 0);

        //修改被攻击人的血量
        r.setBlood(remainBlood);

        System.out.println(this.getName() + "打了" + r.getName() + "一下，" +
                "造成了" + hurt + "点伤害" + r.getName() + "还剩下" + r.getBlood() + "点血");
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}
