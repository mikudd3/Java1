package itheima.java1.d02_operator.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // ^ 异或
        //相同为false，不同为true
        //了解一下即可
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true


        //! 逻辑非 取反
        //提示：
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false);//true
        System.out.println(!true);//false
    }
}
