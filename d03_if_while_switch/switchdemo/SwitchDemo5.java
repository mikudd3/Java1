package itheima.java1.d03_if_while_switch.switchdemo;

/*
    switch和if第三种格式各自的使用场景
    if的第三种格式：一般用于对范围的判断
    switch：把有限个数据一一列举出来，让我们任选其一
*/

public class SwitchDemo5 {
    public static void main(String[] args) {
        int score = 100;
        if(score >= 90 && score <= 100){
            System.out.println("送自行车");
        }
    }
}
