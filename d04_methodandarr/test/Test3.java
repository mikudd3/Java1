package itheima.java1.d04_methodandarr.test;

public class Test3 {
    public static void main(String[] args) {
        //目标：要能区分出什么时候使用带返回值的方法
        //需求：定义方法，比较两个长方形的面积

        //调用方法获取长方形的面积，再进行比较
        double area1 = getArea(5.3, 1.7);
        double area2 = getArea(2.4, 2.7);

        if(area1 > area2){
            System.out.println("第一个长方形更大");
        }else{
            System.out.println("第二个长方形更大");
        }
    }


    //定义一个方法求长方形的面积
    //1.我要干嘛？求长方形的面积
    //2.需要什么？长 和 宽
    //3.方法的调用处，是否需要继续使用方法的结果。
    //如果要用，那么方法必须有返回值
    //如果不要用，方法可以写返回值，也可以不写返回值。
    public static double getArea(double len, double width){
        double area = len * width;
        return area;
    }


    //在以后实际开发当中，我们一般是把重复的代码或者具有独立功能的代码抽取到方法当中。
    //以后我们直接调用就可以了

    //1.我要干嘛？比较两个长方形的面积
    //2.需要什么？两个长 两个宽
/*    public static void compare(double len1, double width1, double len2, double width2){
        double area1 = len1 * width1;
        double area2 = len2 * width2;

        if(area1 > area2){
            System.out.println("第一个长方形更大");
        }else{
            System.out.println("第二个长方形更大");
        }
    }*/


}
