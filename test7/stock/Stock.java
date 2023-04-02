package com.lanqiao.javalearn.java1.test7.stock;

/**
 * @project: 股票类
 * @author: mikudd3
 * @version: 1.0
 */
public class Stock {
    private String symbol;              //股票代码
    private String name;                //股票名字
    private double previousClosingPrice;//前一日的股票值
    private double currentPrice;        //当时的股票值

    public Stock() {
    }

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    //涨跌幅=(现价-上一个交易日收盘价)/上一个交易日收盘价* 100%。
    public String getChangePercent() {

        return ((currentPrice - previousClosingPrice) / previousClosingPrice * 100) + "%";

    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
