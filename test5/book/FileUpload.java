package com.lanqiao.javalearn.java1.test5.book;

import java.util.Scanner;

/**
 * 完成提交论文信息校验的功能，具体需求如下:
 *
 * ①需要检查论文文件名，文件名必须以“.docx”结尾。
 *
 * ②需要检查接收论文反馈的邮箱，邮箱必须含“@”和“”，且“.”在“@”之后。
 * @author mikudd3
 */
public class FileUpload {
    public static void main(String[] args) {
        boolean fileCorrect = false;//判断文件格式是否正确
        boolean emailCorrect = false;//判断邮箱格式是否正确

        Scanner input = new Scanner(System.in);

        System.out.println("请按照以下要求提交论文：");
        System.out.println("请输入论文文件名(文件名必须以.docx结尾):");
        String file = input.nextLine();
        System.out.println("请输入你的接收论文反馈的邮箱：");
        String email = input.nextLine();

        //判断论文文件名格式是否正确
        if (file.endsWith(".docx")) {
            fileCorrect = true;
        } else {
            System.out.println("论文文件名格式不正确，请重新修改文件名");
        }

        //判断邮箱格式是否正确
        if (email.indexOf("@") != -1 && email.indexOf("@") < email.indexOf(".")) {
            emailCorrect = true;
        } else {
            System.out.println("你输入的邮箱有误，请重新输入！！");
        }

        //输出结果
        if (fileCorrect && emailCorrect) {
            System.out.println("论文提交成功！！");
        } else {
            if (fileCorrect) {
                System.out.println("论文提交失败，邮箱格式不符合要求，请重新提交！！");
            } else {
                System.out.println("论文提交失败，论文文件名格式不符合要求，请重新提交！！");
            }
        }
    }
}
