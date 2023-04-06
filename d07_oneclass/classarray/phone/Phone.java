package itheima.java1.d07_oneclass.classarray.phone;

/**
 * @project: 手机类
 * @author: mikudd3
 * @version: 1.0
 */
public class Phone {
    private String name;
    private double price;
    private String color;


    public Phone() {
    }

    public Phone(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
