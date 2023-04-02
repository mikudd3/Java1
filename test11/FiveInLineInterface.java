package com.lanqiao.javalearn.java1.test11;

/**
 * 五子棋接口
 *
 * @author mikudd3
 * @version 1.2
 */
public interface FiveInLineInterface {
    /**
     * 胜负判断入口，产生四个一维数组
     *
     * @param x 横坐标
     * @param y 纵坐标
     * @return
     */
    boolean isWin(int x, int y);

    /**
     * 五子连续判断
     *
     * @param chessmen 棋子周边的一维数组
     * @return 是否存在连续五个棋子一样
     */
    boolean isFiveInline(Chessmen[] chessmen);
}
