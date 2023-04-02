package com.lanqiao.javalearn.java1.test6.book;

/**
 * @project: 图书类
 * @author: mikudd3
 * @version: 1.0
 */
public class Book {
    //书的属性有：书名、价格、作者，书的功能有“输出书的相关信息”，包括“书名：XXX，作者：XXX，价格：XXX”。
    String bName;
    int bPrice;
    String bAuthor;

    public Book() {
    }

    public Book(String bName, int bPrice, String bAuthor) {
        this.bName = bName;
        this.bPrice = bPrice;
        this.bAuthor = bAuthor;
    }

    public void print() {
        System.out.println("书名：" + bName + ",作者：" + bAuthor + "，价格：" + bPrice);
    }

}
