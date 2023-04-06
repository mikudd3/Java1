package itheima.java1.d04_methodandarr.methoddemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MethodDemo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("-10");
        BigDecimal bd2 = new BigDecimal("3");


        BigDecimal add = bd1.divide(bd2,2, RoundingMode.UP);
        System.out.println(add);
    }
}
