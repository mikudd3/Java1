package com.lanqiao.javalearn.java1.test11;

/**
 * 棋盘类  限定为16 X 16
 * 属性：棋子数组
 * 方法：初始化棋盘
 * 方法：展示棋盘
 * 方法: 修改棋盘
 *
 * @author mikudd3
 */
public class ChessBoard {

    //棋盘
    private Chessmen[][] chessmens;

    //初始化棋盘
    public ChessBoard() {
        initBoard(16);
    }

    //创建 16 X 16 棋盘
    private void initBoard(int size) {

        //创建棋盘数组
        chessmens = new Chessmen[size + 8][size + 8];

        //填充棋盘
        for (int i = 4; i < size + 4; i++) {
            for (int j = 4; j < size + 4; j++) {
                chessmens[i][j] = Chessmen.DEFAULT;
            }
        }

    }

    /**
     * 显示棋盘
     */
    public void showBoard() {
        System.out.println("  壹贰叁肆伍陆柒捌玖拾屲亗岌岄岪峘");
        for (int i = 4; i < chessmens.length - 4; i++) {
            //显示空格
            System.out.print(i - 3 + (i - 3 < 10 ? " " : ""));
            for (int j = 4; j < chessmens[i].length - 4; j++) {
                System.out.print(chessmens[i][j]);
            }

            System.out.println();
        }
    }

    /**
     * 更新棋盘信息
     * @param x  横坐标
     * @param y  纵坐标
     * @param chess  棋子
     * @return 是否修改成功
     */
    public boolean changeBoard(int x,int y,Chessmen chess){
        //落子标志
        boolean flag = true;
        if(chessmens[x + 3][y + 3] == Chessmen.DEFAULT){
            chessmens[x + 3][y + 3] = chess;
        }else {
            flag = false;
        }
        return flag;
    }

    //提供棋盘上所有棋子信息
    public Chessmen[][] getChessmens() {
        return chessmens;
    }

}
