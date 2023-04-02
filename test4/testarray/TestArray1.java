package com.lanqiao.javalearn.java1.test4.testarray;

import java.util.Scanner;

/**
 * 统计员工薪资
 *
 * @author mikudd3
 */
public class TestArray1 {
    //全局接收用户输入对象
    Scanner input = new Scanner(System.in);

    //工程师数量固定为10人
    final int COUNT = 10;

    //存储薪资数组
    int[] baseSalary = new int[COUNT];

    //高新人员比例
    double ratio;

    //高新人员平均薪资
    double avg;

    public static void main(String[] args) {
        var ta = new TestArray1();

        ta.inputSalary();
        ta.calc();

        if (ta.ratio == 0.0) {
            System.out.println("很遗憾，10个Java工程师中没有高薪人员！");
        } else {
            System.out.println("10个Java工程师中，高薪人员比例为：" + ta.ratio * 100 + "%");
            System.out.println("高薪人员平均底薪为：" + ta.avg);
        }
        System.out.print("请输入你需要获取第几个工程师的底薪：");

        int index = ta.input.nextInt();

        System.out.println("第" + index + "个工程师的底薪为：" + ta.select(index));

        ta.input.close();
    }

    /**
     * 负责接受输入并存储
     */
    public void inputSalary() {
        for (int i = 1; i <= COUNT; i++) {
            System.out.print("请输入第" + i + "个工程师底薪：");
            // 依次让用户输入的第i个工程师的底薪，注意下标是i-1
            baseSalary[i - 1] = input.nextInt();
        }
    }

    /**
     * 负责计算高薪人员比例和平均工资
     */
    public void calc() {
        int highNum = 0;
        int sumBaseSalary = 9;

        for (int i = 0; i < COUNT; i++) {
            if (baseSalary[i] > 6000) {
                // 高薪人员数量+1
                highNum++;
                // 高薪人员底薪求和
                sumBaseSalary += baseSalary[i];
            }
        }
        if (highNum > 0) {
            // 计算比例和平均薪资
            ratio = highNum * 1.0 / COUNT;
            avg = sumBaseSalary * 1.0 / highNum;
        }
    }

    /**
     * 查询指定员工的薪资
     */
    public int select(int i) {
        return baseSalary[i - 1];
    }
}
