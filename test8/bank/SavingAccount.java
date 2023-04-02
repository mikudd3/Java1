package com.lanqiao.javalearn.java1.test8.bank;

/**
 * 储蓄账户类
 *
 * @author mikudd3
 */
public class SavingAccount extends Account {
    private static double interest;  //年利率，私有静态

    public SavingAccount(long id, String name, String password, double balance) {
        super(id, name, password, balance);
        this.interest = interest;
    }

    public SavingAccount(long id, String name, String password) {
        super(id, name, password);
    }

    public static double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        SavingAccount.interest = interest;
    }

    public void countInterest() {

        //###  计算利息并调用父类的存款方法deposit()存入账户 ###

        double countIn = super.getBalance() * SavingAccount.getInterest();
        //利息=余额*利率

        super.deposit(countIn);
    }
}
