package com.lanqiao.javalearn.java1.test8.bank;

/**
 * 信用账户类
 *
 * @author mikudd3
 */
public class CreditAccount extends Account {
    private double ceiling;  //透支额度
    private double money; //取现额度


    public CreditAccount(long id, String name, String password, double balance, double ceiling, double money) {
        this(id, name, password, balance, ceiling);
        this.money = money;
    }

    public CreditAccount(long id, String name, String password, double ceiling, double money) {
        super(id, name, password);
        this.money = money;
        this.ceiling = ceiling;
    }

    public void purchase(double payment) {    //刷卡消费
        System.out.println("您的卡号为：" + this.getId());
        System.out.println("刷卡消费：" + payment);

        if ((this.getBalance() + this.ceiling - payment) > 0) {  //可以透支

            this.setBalance(this.getBalance() - payment); //计算余额
            System.out.println("最终余额为：" + this.getBalance() + "\n");

        } else {
            System.out.println("超过透支额度！此次刷卡无效! \n");
        }

    }

    @Override
    public void withdraw(double cash) {   //重写父类的取款方法

        //判断可以提现的条件 如果可以则调用父类的
        // withdraw() 方法进行取款操作，不能则提示超过透支额度或取现额度。
        //提现金额小于允许提现的金额以及透支额度加余额需大于提现的金额。
        if ((this.getMoney() - cash) > 0 || (this.getBalance() + this.getCeiling() - cash) > 0) {
            super.withdraw(cash);
        } else {
            System.out.println("透支额度或取现额度不足");
        }
    }

    public double getCeiling() {
        return ceiling;
    }

    public void setCeiling(double ceiling) {
        this.ceiling = ceiling;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
