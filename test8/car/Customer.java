package com.lanqiao.javalearn.java1.test8.car;

import java.util.Scanner;

/**
 * @project: 顾客类
 * @author: mikudd3
 * @version: 1.0
 */
public class Customer {
    public void selectCar(Car c) {
        if (c instanceof Bmw) {
            Bmw b1 = (Bmw) c;
            b1.carModel();
        } else if (c instanceof Benz) {
            Benz b2 = (Benz) c;
            b2.carConfig();
        } else {
            System.out.println("无对应车辆信息");
        }
    }

    public static void main(String[] args) {

        System.out.println("请输入车辆品牌：");
        var input = new Scanner(System.in);

        String s = input.next();

        var cf = new CarFactory();

        var c = cf.getCar(s);

        var cus = new Customer();

        cus.selectCar(c);
    }
}
