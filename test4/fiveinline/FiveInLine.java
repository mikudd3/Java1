package com.lanqiao.javalearn.java1.test4.fiveinline;

import java.util.Scanner;

/**
 * project 面向过程五子棋
 * @author mikudd3
 */
public class FiveInLine {

    //玩家A棋子(先手)
    String playerA = "🔴";

    //玩家B棋子(后手)
    String playerB = "🔵";

    //棋盘组件
    String boardCompent = "➕";

    //构建棋盘
    String[][] board;

    //落子标识i
    boolean initiative = true;

    //判断胜负
    int pointCount = 5;

    //玩家A
    String playerNameA;

    //玩家B
    String playerNameB;


    /**
     * 初始化玩家信息
     */
    public void initPlayer() {
        //默认角色
        System.out.println("----------------------------------");
        System.out.println("五子棋对战规则：\n  \t 1. 一人一步 \n \t 2. 无禁手 \n \t 3. 五子连线获取");
        System.out.println("---------------------------------");
        String[] roles = {"吕布", "关羽", "张飞", "典韦", "许储", "赵云", "马超", "黄忠", "孙策", "周瑜"};

        //获取0到9的随机数
        int a = (int) (Math.random() * 10);
        //玩家A
        playerNameA = roles[a];

        int b = 0;

        //当玩家A的名字与玩家B的名字不相等时退出循环
        do {
            //玩家B
            b = (int) (Math.random() * 10);
            playerNameB = roles[b];
        } while (playerNameA.equals(playerNameB));

        System.out.println("进行随机分配角色。。。 \n 分配玩家 A 角色：" + playerNameA + " \n 分配玩家 B 角色：" + playerNameB);

        System.out.println("---------------------------------");

        //猜先
        initiative = a < b;
        //谁数组下标值越小，谁先
        System.out.println("开始猜先。。。\n" + (initiative ? playerNameB : playerNameA) + "获得先手");
        System.out.println("---------------------------------");

    }

    /*
     * 初始化棋盘
     * */
    public void initBoard() {
        //棋盘大小
        int size = 16;

        //创建棋盘数组
        board = new String[size + 8][size + 8];

        //填充棋盘
        for (int i = 4; i < size + 4; i++) {
            for (int j = 4; j < size + 4; j++) {
                board[i][j] = boardCompent;
            }
        }

    }

    /*
     * 显示棋盘
     * */
    public void showBoard() {
        System.out.println("  壹贰叁肆伍陆柒捌玖拾屲亗岌岄岪峘");
        for (int i = 4; i < board.length - 4; i++) {

            //显示空格
            System.out.print(i - 3 + (i - 3 < 10 ? " " : ""));

            for (int j = 4; j < board[i].length - 4; j++) {
                System.out.print(board[i][j]);
            }

            System.out.println();
        }
    }

    /*
    落子
    * */
    public boolean movesChessman(int x, int y) {
        boolean result = false;

        //当前位置未落子
        if (board[x][y].equals(boardCompent)) {
            //落子，先假定玩家B
            board[x][y] = playerB;
            if (initiative) {
                //玩家A落子，如果initiative 为true，则让玩家A覆盖玩家B的落子
                board[x][y] = playerA;
            }

            //切换落子
            initiative = !initiative;

            //判断是否已经结束
            result = isWin(x, y);

        } else {
            System.out.println("该位置已经落子，请选择另一处");
        }
        //重新加载棋盘
        showBoard();

        return result;
    }

    /*
     * 判断胜负
     * */
    public boolean isWin(int x, int y) {
        //1 获取4条线
        String[] up = {board[x][y - 4], board[x][y - 3], board[x][y - 2], board[x][y - 1], board[x][y], board[x][y + 1], board[x][y + 2], board[x][y + 3], board[x][y + 4]};
        String[] down = {board[x - 4][y], board[x - 3][y], board[x - 2][y], board[x - 1][y], board[x][y], board[x + 1][y], board[x + 2][y], board[x + 3][y], board[x + 4][y]};
        String[] left = {board[x - 4][y - 4], board[x - 3][y - 3], board[x - 2][y - 2], board[x - 1][y - 1], board[x][y], board[x + 1][y + 1], board[x + 2][y + 2], board[x + 3][y + 3], board[x + 4][y + 4]};
        String[] right = {board[x - 4][y + 4], board[x - 3][y + 3], board[x - 2][y + 2], board[x - 1][y + 1], board[x][y], board[x + 1][y - 1], board[x + 2][y - 2], board[x + 3][y - 3], board[x + 4][y - 4]};
        //2 每条线是否符合胜利条件
        return (isFiveInLine(up) || isFiveInLine(down) || isFiveInLine(left) || isFiveInLine(right));
    }

    /*
     * 判断是否已经连成五个
     * */
    private boolean isFiveInLine(String[] line) {

        String b = playerA;

        if (initiative) {
            b = playerB;
        }

        //是否五子连线
        boolean flag = false;

        for (int i = 0; i < line.length; i++) {

            if (line[i] != null) {

                if (!b.equals(line[i])) {

                    //如果没有连续，重新计数
                    pointCount = 0;
                    continue;
                }
                pointCount++;

                //如果存在连续五个棋子
                if (pointCount == 5) {
                    flag = true;
                    break;
                }

            }

        }

        return flag;

    }

    /*
     * 下棋
     * */
    public void play() {
        Scanner input = new Scanner(System.in);

        //调用初始化玩家信息的方法
        initPlayer();

        //调用初始化棋盘方法
        initBoard();
        System.out.print("任意键回车开始对弈");
        input.nextLine();
        //调用显示棋盘方法
        showBoard();
        String tempName;
        int horizontal, vertical;
        while (true) {
            horizontal = 0;
            vertical = 0;
            tempName = playerNameA;
            if (initiative) {
                tempName = playerNameB;
            }
            while (true) {
                System.out.print(tempName + "请输入落子的横坐标：");
                horizontal = input.nextInt();
                System.out.print(tempName + "请输入落子的纵坐标：");
                vertical = input.nextInt();
                if ((vertical <= 0 || vertical > 16) || horizontal <= 0 || horizontal > 16) {
                    System.out.println("落子不在棋盘中，请重新落子");
                    continue;
                }
                break;
            }
            //调用落子修改棋盘方法
            if (movesChessman(horizontal + 3, vertical + 3)) {
                System.out.println(tempName + "获得胜利，游戏结束");
                //分出胜负，游戏结束
                break;
            }
        }

    }


}
