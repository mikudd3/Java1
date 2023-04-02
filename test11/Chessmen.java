package com.lanqiao.javalearn.java1.test11;

/**
 * 棋子枚举类
 * 只能获取棋子，不能设置
 *
 * @author mikudd3
 */
public enum Chessmen {
    WHITE("🔵"), BLACK("🔴"), DEFAULT("➕");

    private String chessmen;

    //只有私有，默认私有
    Chessmen(String chessmen) {
        this.chessmen = chessmen;
    }


    public String getChessmen() {
        return chessmen;
    }

    @Override
    public String toString() {
        return getChessmen();
    }
}
