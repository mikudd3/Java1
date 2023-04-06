package itheima.java1.d07_oneclass.classarray.goods;

/**
 * @project: 商品类
 * @author: mikudd3
 * @version: 1.0
 */
public class Commodity {
    private String id;      //编号
    private String name;    //姓名

    private double price;   //价格
    private int inventory;  //库存

    public Commodity() {
    }

    public Commodity(String id, String name, double price, int inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
