package com.lanqiao.javalearn.java1.test4.testdoublearray;

/**
 * @project: 计算科目成绩测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestCountScore {

    public static void main(String[] args) {
        //课程名称
        String[] course = {"Java基础", "前端技术", "后端技术"};
        //学生姓名
        String[] name = {"小蓝", "小雨", "小南", "小雷"};
        //存放所有学生各科成绩
        int[][] stuScore = new int[3][4];

        // 创建 CountScore 对象
        CountScore cs = new CountScore();

        //输入成绩
        cs.inputScore(course, name, stuScore);
        //计算各科的平均成绩
        int[] singleSum = cs.eachAvgScore(course, stuScore);
        //计算全部科目的平均成绩
        cs.totalAvgScore(singleSum);

    }
}

