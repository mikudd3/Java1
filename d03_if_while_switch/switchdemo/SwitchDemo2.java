package itheima.java1.d03_if_while_switch.switchdemo;

/*
    default的位置和省略

    1.位置 ：defaule不一定是写在最下面的，我们可以写在任意位置。只不过习惯会写在最下面
    2.省略 : defaule可以省略，语法不会有问题，但是不建议省略。
*/
public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 100;
        switch (number){
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1,10或者20");
                break;
        }
    }
}
