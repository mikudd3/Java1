package itheima.java1.d07_oneclass.classarray.phone;


/**
 * @project: 手机类测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestPhone {
    public static void main(String[] args) {
        //创建对象数组
        Phone[] phones = new Phone[3];

        //创建对象
        Phone p1 = new Phone("小米", 1999, "黑色");
        Phone p2 = new Phone("华为", 3999, "白色");
        Phone p3 = new Phone("苹果", 9999, "黑色");

        //将对象加入数组
        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        //计算平均值
        double sum = 0;
        for (Phone phone : phones) {
            sum += phone.getPrice();
        }

        System.out.println("平均价格为：" + sum / phones.length);
    }
}
