package itheima.java1.d07_oneclass.classarray.goods;

/**
 * @project: 商品类测试
 * @author: mikudd3
 * @version: 1.0
 */
public class GoodsTest {
    public static void main(String[] args) {
        //创建对象数组
        Commodity[] commodities = new Commodity[3];

        //创建三个商品对象
        Commodity c1 = new Commodity("001", "小米", 1999, 5678);
        Commodity c2 = new Commodity("002", "华为", 7999, 5678);
        Commodity c3 = new Commodity("003", "苹果", 12999, 5678);

        //将对象加入数组
        commodities[0] = c1;
        commodities[1] = c2;
        commodities[2] = c3;

        //遍历数组
        for (Commodity c : commodities) {
            System.out.println("编号：" + c.getId() + " 品牌：" + c.getName()
                    + " 价格：" + c.getPrice() + " 库存：" + c.getInventory());
        }
    }
}
