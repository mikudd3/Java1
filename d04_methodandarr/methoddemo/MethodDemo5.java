package itheima.java1.d04_methodandarr.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //目标：掌握带返回值方法的定义和调用格式

        //直接调用
        //getSum(10,20,30);

        //赋值调用
        //int sum = getSum(10,20,30);
        //System.out.println(sum);

        //输出调用
        //System.out.println(getSum(10,20,30));


        //先计算第一个季度的营业额
        int sum1 = getSum(10,20,30);
        //再来计算第二个季度的营业额
        int sum2 = getSum(20,30,40);
        //计算第三个季度的营业额
        int sum3 = getSum(20,30,40);
        //计算第四个季度的营业额
        int sum4 = getSum(20,30,40);

        //求全年的总营业额
        int sum = sum1 + sum2 + sum3 + sum4;

        System.out.println(sum);


    }

    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;//返回给方法的调用处
    }



}
