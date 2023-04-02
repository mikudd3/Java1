package com.lanqiao.javalearn.java1.test11;

import java.util.Scanner;

public class ChessGame implements FiveInLineInterface {

    private Scanner input = new Scanner(System.in);
    //落子顺序
    private boolean initiative = true;
    //棋子连线数
    private int pointCount = 0;
    //棋盘
    private ChessBoard board = new ChessBoard();
    //本局对战玩家信息
    private Player[] players = new Player[2];


    /**
     * 初始界面
     */
    public void showMain() {
        System.out.println("*********** mikudd3 五子棋 *************");
        System.out.println("------------游戏说明-----------------");
        System.out.println("------1.落子方式为指定坐标-----------");
        System.out.println("------2.数字与数字之前用,号隔开------");
        System.out.println("------3.合法输入格式：5,5-------------");
        System.out.println("------4.无禁手规则-----------------");
        System.out.println("------5.五子连线获胜----------------");
        System.out.println("************************************");
    }

    /**
     * 初始化玩家信息
     */
    public void initPlayer() {

        showMain();
        //默认角色
        String[] roles = {"吕布", "关羽", "张飞", "典韦", "许储", "赵云", "马超", "黄忠", "孙策", "周瑜"};

        //创建两个角色
        Player playerA = new Player();
        Player playerB = new Player();


        //获取0到9的随机数
        int a = (int) (Math.random() * 10);


        //玩家A
        playerA.setName(roles[a]);
        int b = 0;
        //当玩家A的名字与玩家B的名字不相等时退出循环
        do {
            //玩家B
            b = (int) (Math.random() * 10);
            playerB.setName(roles[b]);
        } while (playerA.getName().equals(playerB.getName()));

        players[0] = playerA;
        players[1] = playerB;


        System.out.println("进行随机分配角色。。。 \n 分配玩家 A 角色："
                + playerA.getName() + " \n 分配玩家 B 角色：" + playerB.getName());
        System.out.println("---------------------------------");

        System.out.println(playerA + "\n" + playerB);
        //猜先
        initiative = a < b;
        //谁数组下标值越小，谁先
        System.out.println("开始猜先。。。\n" +
                (initiative ? playerB.getName() : playerA.getName()) + "获得先手");
        System.out.println("---------------------------------");

        System.out.print("任意键回车开始对弈");
        input.nextLine();
    }

    /**
     * 开始下棋
     */
    public void play() {
        //调用初始化玩家信息的方法
        initPlayer();
        //棋子
        Chessmen chess = null;
        //落子位置
        int x = 0;
        int y = 0;
        Player tempPlayer;
        do {
            board.showBoard();
            x = 0;
            y = 0;
            System.out.print((initiative ? players[1].getName() : players[0].getName()) + "请输入要下的位置:");
            if (initiative) {
                chess = Chessmen.BLACK;
            } else {
                chess = Chessmen.WHITE;
            }

            while (true) {
                //落子位置
                String point = input.next();
                //对落子位置进行分割
                if (point.matches("\\d+,\\d+")) {
                    String[] ps = point.split(",");
                    x = Integer.parseInt(ps[0]);
                    y = Integer.parseInt(ps[1]);
                    if (x > 16 || x < 0 || y > 16 || y < 0) {
                        System.out.print("请控制坐标在棋盘内");
                        continue;
                    }
                    break;
                } else {
                    System.out.print("请按要求输入落子坐标");
                }
            }

            //在指定位置落子
            if (board.changeBoard(x, y, chess)) {
                //落子成功，切换先手
                initiative = !initiative;
                //判断胜负
                if (isWin(x, y)) {
                    //展示胜盘
                    board.showBoard();
                    if (initiative) {
                        //如果A赢
                        tempPlayer = players[0];
                    } else {
                        //如果是B赢
                        tempPlayer = players[1];
                    }
                    //胜局次数加一
                    tempPlayer.setWinTimes(tempPlayer.getWinTimes() + 1);
                    //积分加5
                    tempPlayer.setWinTimes(tempPlayer.getScore() + 5);
                    //输出胜者基本信息
                    System.out.println(tempPlayer);
                    System.out.print(tempPlayer.getName() + "胜利，胜局加1 ，是否继续对战(按0继续，其它结束)");
                    //判断是否继续比赛
                    if (!"0".equals(input.next())) {
                        System.out.println("游戏结束");
                        break;
                    } else {
                        //重新加载棋盘, 换先
                        System.out.println("双方交换棋子换先，开始对战");
                        board = new ChessBoard();
                    }
                }
            } else {
                System.out.println("此处已经存在棋子");
            }
        } while (true);
    }

    /**
     * 判断是否胜利 ，需要注意坐标需要加3
     *
     * @param x 棋子横坐标
     * @param y 棋子纵坐标
     * @return
     */
    @Override
    public boolean isWin(int x, int y) {
        x = x + 3;
        y = y + 3;
        Chessmen[][] chesses = board.getChessmens();
        Chessmen[] up = {chesses[x][y - 4], chesses[x][y - 3], chesses[x][y - 2], chesses[x][y - 1], chesses[x][y], chesses[x][y + 1], chesses[x][y + 2], chesses[x][y + 3], chesses[x][y + 4]};
        Chessmen[] down = {chesses[x - 4][y], chesses[x - 3][y], chesses[x - 2][y], chesses[x - 1][y], chesses[x][y], chesses[x + 1][y], chesses[x + 2][y], chesses[x + 3][y], chesses[x + 4][y]};
        Chessmen[] left = {chesses[x - 4][y - 4], chesses[x - 3][y - 3], chesses[x - 2][y - 2], chesses[x - 1][y - 1], chesses[x][y], chesses[x + 1][y + 1], chesses[x + 2][y + 2], chesses[x + 3][y + 3], chesses[x + 4][y + 4]};
        Chessmen[] right = {chesses[x - 4][y + 4], chesses[x - 3][y + 3], chesses[x - 2][y + 2], chesses[x - 1][y + 1], chesses[x][y], chesses[x + 1][y - 1], chesses[x + 2][y - 2], chesses[x + 3][y - 3], chesses[x + 4][y - 4]};
        return isFiveInline(up) || isFiveInline(down) || isFiveInline(left) || isFiveInline(right);
    }

    /**
     * 判断一维数组中是否有五子连线
     *
     * @param chessmen 需要判断是数组
     * @return
     */
    @Override
    public boolean isFiveInline(Chessmen[] chessmen) {
        String flag = Chessmen.BLACK.getChessmen();
        if (initiative) {
            flag = Chessmen.WHITE.getChessmen();
        }
        boolean result = false;
        for (int i = 0; i < chessmen.length; i++) {
            if (chessmen[i] != null) {
                if (!flag.equals(chessmen[i].getChessmen())) {
                    //如果没有连续，重新计数
                    pointCount = 0;
                    continue;
                }
                pointCount++;
                if (pointCount == 5) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
