package com.lanqiao.javalearn.java1.test10;

public class JavaEngineerTest {
    public static void main(String[] args) throws Exception {

        JavaEngineer je = new JavaEngineer();

        while (true) {
            int usrSel = je.showMenu();
            if(usrSel == 0){
                System.out.println("程序结束！！感谢你的使用！");
                break;
            }else{
                switch (usrSel) {
                    case 1:
                        je.inputEngineerInfo();
                        break;
                    case 2:
                        je.deleteEngineerInf0();
                        break;
                    case 3:
                        je.queryEngineerInf0();
                        break;
                    case 4:
                        je.updateEngineerInf0();
                        break;
                    case 5:
                        je.calAvgSalary();
                        break;
                    case 6:
                        je.saveEngineerInf0();
                        break;
                    case 7:
                        je.rankEngineerInf0();
                        break;
                    case 8:
                        je.showEngineerInf0();
                        break;
                    case 9:
                        je.emptyEngineerInf0();
                        break;
                    case 10:
                        je.printEngineerInf0();
                        break;
                    case 11:
                        je.importEngineerInf0();
                        break;
                    default:
                        System.out.println("输入错误，请重新输入！");
                        break;
                }
            }
        }


    }

}
