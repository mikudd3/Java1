package itheima.java1.d02_operator.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        //现在我们要强转的是谁？
        //b1 + b2计算之后的结果。
        // (byte)b1 + b2 强转的是b1，并不是最终的结果
        byte result = (byte)(b1 + b2);
        System.out.println(result);//30
    }
}
