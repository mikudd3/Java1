package itheima.java1.d05_test.synthesis;

import java.util.Random;
import java.util.Scanner;

/**
 * @project: 双色球
 * 投注号码由6个双色球号码和1个蓝色球号码组成，红色球号码从1-33中选择
 * 蓝色球号码从1-16中选择
 * @author: mikudd3
 * @version: 1.0
 */
public class Lottery {
    public static void main(String[] args) {
        //生成中奖号码
        int[] arr = createNumber();

        //用户输入号码
        int[] userInputArr = userInputNumber();

        //红色号码中奖数量
        int redCount = getRedCount(arr, userInputArr);
        //蓝色号码中奖数量
        int blueCount = getBlueNum(arr, userInputArr);

        //中奖情况
        win(redCount, blueCount);

    }

    public static void win(int redCount, int blueCount) {
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000w");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500w");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖20");
        } else if ((redCount == 2 && blueCount == 2) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5");
        } else {
            System.out.println("谢谢参与，谢谢惠顾");
        }
    }

    /**
     * 蓝色号码中奖数量
     *
     * @param arr
     * @param userInputArr
     * @return
     */
    public static int getBlueNum(int[] arr, int[] userInputArr) {
        int count = 0;
        if (arr[arr.length - 1] == userInputArr[userInputArr.length - 1]) {
            count++;
        }
        return count;
    }

    /**
     * 判断红色球中奖数量
     *
     * @param arr
     * @param userInputArr
     * @return
     */
    public static int getRedCount(int[] arr, int[] userInputArr) {
        int count = 0;
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int red = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (red == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    /**
     * 用户输入抽奖结果
     *
     * @return
     */
    public static int[] userInputNumber() {
        //存储用户输入号码
        int[] arr = new int[7];

        //输入红球
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红色球号码：");
            int redNumber = input.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                //判断是否存在
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("该号码已经存在，请重新输入：");
                }
            } else {
                System.out.println("号码超出范围");
            }
        }

        //蓝色球
        while (true) {
            System.out.println("请输入蓝色球号码：");
            int blueNumber = input.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("号码超出范围");
            }
        }

        return arr;
    }

    /**
     * 生成中奖号码
     *
     * @return
     */
    public static int[] createNumber() {
        //添加中奖号码
        int[] arr = new int[7];

        //随机红色球生成号码
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //虎丘红球号码
            int prize = r.nextInt(33) + 1;
            boolean flag = contains(arr, prize);
            if (!flag) {
                arr[i] = prize;
                i++;
            }
        }

        //随机生成蓝色球号码
        arr[arr.length - 1] = r.nextInt(16) + 1;
        return arr;
    }

    /**
     * 判断该数是否在数组中存在
     *
     * @param arr
     * @param prize
     * @return
     */
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
