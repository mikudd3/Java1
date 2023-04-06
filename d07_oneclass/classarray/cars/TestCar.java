package itheima.java1.d07_oneclass.classarray.cars;


import java.util.Scanner;

/**
 * @project: 汽车类测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestCar {
    public static void main(String[] args) {
        //创建对象数组
        Car[] cars = new Car[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            //创建car对象
            Car c = new Car();
            System.out.println("请输入品牌：");
            c.setName(input.next());
            System.out.println("请输入价格：");
            c.setPrice(input.nextDouble());
            System.out.println("请输入颜色：");
            c.setColor(input.next());

            cars[i] = c;
        }


        //遍历数组
        for (Car car : cars) {
            System.out.println("品牌：" + car.getName() + "价格：" + car.getPrice() + "颜色：" + car.getColor());
        }
    }
}
