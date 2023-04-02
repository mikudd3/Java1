package com.lanqiao.javalearn.java1.test10;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class JavaEngineer {

    private final ArrayList<Engineer> array;   //储存数据

    public JavaEngineer() throws Exception {
        this.array = new ArrayList<>();

        //判断文件是否存在，若不存在则创建文件
        File f = new File("array.txt");
        if (!f.exists()) {
            f.createNewFile();
        }

        //将文件数据保存到数组
        importEngineerInf0();
    }

    //主界面
    public int showMenu() throws Exception {
        Scanner input = new Scanner(System.in);
        //显示主界面
        System.out.println("---------------------------");
        System.out.println("mikudd3-Java工程师管理系统");
        System.out.println("---------------------------");
        System.out.println("1.输入Java工程师资料");
        System.out.println("2.删除指定Java工程师资料");
        System.out.println("3.查询指定Java工程师资料");
        System.out.println("4.修改java工程师资料");
        System.out.println("5.计算Java工程师月薪");
        System.out.println("6.保存新添加的工程师资料");
        System.out.println("7.对Java工程师信息进行排序(1编号升序，2用户名降序)");
        System.out.println("8.输出所有Java工程师信息");
        System.out.println("9.清空所有Java工程师数据");
        System.out.println("10.打印Java工程师数据报表");
        System.out.println("11.从文件重新导入Java工程师数据");
        System.out.println("0.结束");
        System.out.println("---------------------------");
        System.out.println("请输入你的选择：");
        //输入选择
        int usrSel = input.nextInt();

        return usrSel;
    }

    //计算Java工程师月薪
    public void calAvgSalary() {
        Scanner input = new Scanner(System.in);

        double avgSalary;//java工程师月薪
        int baseSalary;//底薪
        int comResult;//月工作完成分数，0最低，100最大
        double workDay;//月工作天数
        double insurance;//月应扣保险数

        System.out.println("请输入Java工程师底薪");
        baseSalary = input.nextInt();
        System.out.println("请输入月完成分数，0最小，100最大");
        comResult = input.nextInt();
        System.out.println("请输入月工作天数");
        workDay = input.nextDouble();
        System.out.println("请输入应扣保险数");
        insurance = input.nextDouble();
        avgSalary = baseSalary + baseSalary * 0.25 * comResult / 100 + 15 * workDay - insurance;
        System.out.println("java工程师月薪为：" + avgSalary);

    }

    //输入Java工程师资料
    public void inputEngineerInfo() throws Exception {
        Scanner input = new Scanner(System.in);
        String engName;
        String pwd1, pwd2;

        boolean flag;
        do {
            System.out.println("请输入Java工程师用户名(用户名长度不能小于4)：");
            engName = input.next();
            System.out.println("请输入密码(密码长度不能小于6)：");
            pwd1 = input.next();
            System.out.println("请再次输入密码(密码长度不能小于6)：");
            pwd2 = input.next();
            flag = isCorrect(engName, pwd1, pwd2);
        } while (!flag);
        System.out.println("注册成功，感谢你的使用！！");

        Engineer e = new Engineer();
        e.setEngName(engName);
        e.setPassword(pwd1);

        System.out.println("请输入Java工程师的编号：");
        int engNum = input.nextInt();
        e.setEngNum(engNum);

        System.out.println("请输入Java工程师年龄：");
        int age = input.nextInt();
        e.setAge(age);

        System.out.println("请输入Java工程师月薪：");
        double avgSalary = input.nextDouble();
        e.setAvgSalary(avgSalary);

        System.out.println("请输入Java工程师底薪：");
        int baseSalary = input.nextInt();
        e.setBaseSalary(baseSalary);

        //加入数组
        array.add(e);
        //将新添加的数据放入文件
        saveEngineerInf0();
    }

    //判断是否符合注册要求
    private boolean isCorrect(String name, String pwd1, String pwd2) {
        boolean flag = false;
        if (name.length() < 4 || pwd1.length() < 6) {
            System.out.println("输入错误，用户名长度不能小于4，密码长度不能小于6！");
        } else if (!pwd1.equals(pwd2)) {
            System.out.println("输入错误，两次输入密码不相同，请重新输入");
        } else {
            flag = true;
        }
        return flag;
    }

    //删除指定Java工程师资料
    public void deleteEngineerInf0() throws Exception {
        Scanner input = new Scanner(System.in);
        String engName;
        System.out.println("请输入你要删除的Java工程师资料的用户名：");
        engName = input.next();

        //查找员工是否存在
        int res = IsExist(engName);

        if (res != -1) {
            array.remove(res);
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败，查无此用户");
        }

        //保存新的Java工程师资料
        saveEngineerInf0();
    }

    //查询指定Java工程师资料
    public void queryEngineerInf0() {
        Scanner input = new Scanner(System.in);
        String engName;
        System.out.println("请输入你要查询的Java工程师资料的用户名：");
        engName = input.next();

        //查找员工是否存在
        int res = IsExist(engName);

        if (res != -1) {
            Engineer e = array.get(res);
            System.out.println("查找成功，该Java工程师资料为：");
            System.out.println("用户名：");
            System.out.println(e.getEngName() + "\t");

            System.out.println("年龄：");
            System.out.println(e.getAge() + "\t");

            System.out.println("编号：");
            System.out.println(e.getEngNum() + "\t");

            System.out.println("月薪：");
            System.out.println(e.getAvgSalary() + "\t");

            System.out.println("底薪：");
            System.out.println(e.getBaseSalary() + "\t");

        } else {
            System.out.println("查找失败，查无此用户");
        }

    }

    //查询员工是否存在
    private int IsExist(String engName) {
        int res = -1;
        for (int i = 0; i < array.size(); i++) {
            Engineer e = array.get(i);
            if (Objects.equals(e.getEngName(), engName)) {
                res = i;
                break;
            }
        }
        return res;
    }

    //修改java工程师资料
    public void updateEngineerInf0() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要修改的java工程师的用户名：");
        String engName = input.next();

        //查找Java工程师
        int res = IsExist(engName);

        if (res != -1) {
            String newEngName;
            String newPwd1;
            String newPwd2;
            System.out.println("找到该Java工程师，请进行修改：");
            boolean flag;
            do {
                System.out.println("请输入修改后的用户名：");
                newEngName = input.next();

                System.out.println("请输入修改后的密码：");
                newPwd1 = input.next();
                System.out.println("请再次输入修改后的密码：");
                newPwd2 = input.next();
                //判断修改的用户名与密码是否符合要求
                flag = isCorrect(newEngName, newPwd1, newPwd2);
            } while (!flag);

            array.get(res).setEngName(newEngName);
            array.get(res).setPassword(newPwd1);

            System.out.println("请输入Java工程师编号：");
            int engNum = input.nextInt();
            array.get(res).setEngNum(engNum);

            System.out.println("请输入Java工程师年龄：");
            int age = input.nextInt();
            array.get(res).setAge(age);

            System.out.println("请输入Java工程师月薪：");
            double avgSalary = input.nextDouble();
            array.get(res).setAvgSalary(avgSalary);

            System.out.println("请输入Java工程师底薪：");
            int baseSalary = input.nextInt();
            array.get(res).setBaseSalary(baseSalary);
        } else {
            System.out.println("修改失败，查无此用户");
        }


        //保存修改后的Java工程师资料
        saveEngineerInf0();

    }

    //保存新添加的工程师资料
    public void saveEngineerInf0() throws Exception {

        try (FileWriter fw = new FileWriter("array.txt")) {

            try (BufferedWriter bw = new BufferedWriter(fw)) {

                //遍历集合,得到每一个学生信息，并把学生信息按照一定的格式写入文本文件
                for (Engineer e : array) {


                    String sb = e.getEngName() + "," + e.getPassword() + "," + e.getAvgSalary() +
                            "," + e.getBaseSalary() + "," + e.getEngNum() + "," + e.getAge();

                    bw.write(sb);
                    bw.newLine();
                    bw.flush();
                }
            }
        }

    }

    //对Java工程师信息进行排序(1编号升序，2用户名降序)
    public void rankEngineerInf0() {
        //传入比较器，自定义比较方法
        array.sort((t1, t2) -> {
            int num = t1.getEngNum() - t2.getEngNum();
            int num2 = (num == 0) ? t1.getEngName().compareTo(t2.getEngName()) : num;
            return Integer.compare(num2, 0);
        });
        printEngineerInf0();
    }

    //输出所有Java工程师信息
    public void showEngineerInf0() {
        for (Engineer e : array) {
            System.out.println("用户名：");
            System.out.println(e.getEngName());

            System.out.println("编号：");
            System.out.println(e.getEngNum());

            System.out.println("年龄");
            System.out.println(e.getAge());

            System.out.println("月薪：");
            System.out.println(e.getAvgSalary());

            System.out.println("底薪：");
            System.out.println(e.getBaseSalary());
        }
    }

    //清空所有Java工程师数据
    public void emptyEngineerInf0() {
        array.clear();
        File f = new File("array.txt");
        f.delete();
    }

    //打印Java工程师数据报表
    public void printEngineerInf0() {
        System.out.println("用户名：" + "\t" + "密码：" + "\t" + "\t" + "月薪:\t" + "底薪:   " + "编号:   " + "年龄：   ");

        for (Engineer e : array) {
            System.out.println(e.getEngName() + "\t" + e.getPassword() + "\t\t" + e.getAvgSalary() + "\t" + e.getBaseSalary()
                    + "\t" + e.getEngNum() + "\t" + "   " + e.getAge());
        }

    }

    //从文件重新导入Java工程师数据
    public void importEngineerInf0() throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("array.txt"));

        while (br.ready()) {

            Engineer e = new Engineer();

            String s = br.readLine();
            String[] strings = s.split(",", 6);

            e.setEngName(strings[0]);
            e.setPassword(strings[1]);
            e.setAvgSalary(Double.parseDouble(strings[2]));
            e.setBaseSalary(Integer.parseInt(strings[3]));
            e.setEngNum(Integer.parseInt(strings[4]));
            e.setAge(Integer.parseInt(strings[5]));

            array.add(e);

        }

        br.close();
    }

}


