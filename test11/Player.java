package com.lanqiao.javalearn.java1.test11;

public class Player {

    private String name;        //昵称
    private int level;          //等级
    private int score;          //积分
    private int winTimes;       //胜局次数
    private String password;    //密码

    public Player(){

    }

    public Player(String name, int level, int score, int winTimes, String password) {
        this.name = name;
        this.level = level;
        this.score = score;
        this.winTimes = winTimes;
        this.password = password;
    }

    /**
     * 显示玩家基本信息
     *
     * @return
     */
    @Override
    public String toString() {
        return "玩家基本信息[" +
                "姓名：" + name + '\'' +
                ", 等级 = " + level +
                ", 积分 = " + score +
                "分, 胜局次数：" + winTimes +
                ", 密码：" + password + '\'' +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWinTimes() {
        return winTimes;
    }

    public void setWinTimes(int winTimes) {
        this.winTimes = winTimes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
