package itheima.java1.d09_extend.oop_extend.a10oopextendsdemo10;

public class Cook extends Employee{

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}
