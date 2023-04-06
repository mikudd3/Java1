package itheima.java1.d09_extend.oop_extend.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        //创建对象并赋值调用
        Manager m = new Manager("heima001","张三",15000,8000);
        System.out.println(m.getId() + ", " + m.getName() +
                ", " + m.getSalary() + ", " + m.getBouns());
        m.work();
        m.eat();



        Cook c = new Cook();
        c.setId("heima002");
        c.setName("李四");
        c.setSalary(8000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
