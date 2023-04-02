package com.lanqiao.javalearn.java1.test9.multi;

public class NormalMan implements Biology,Animal,Man{

    private String name;    //姓名

    public NormalMan(String name) {
        this.name = name;
    }


    @Override
    public void hasSex() {
        System.out.println(getName() + "has sex");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "eats food");
    }

    @Override
    public void breath() {
        System.out.println(getName() + "breathes with lungs");
    }

    @Override
    public void think() {
        System.out.println(getName() + "think with brain");
    }

    @Override
    public void study() {
        System.out.println(getName() + "read books");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        NormalMan nm = new NormalMan("Tom");
        nm.breath();
        nm.eat();
        nm.hasSex();
        nm.think();
        nm.study();
    }
}
