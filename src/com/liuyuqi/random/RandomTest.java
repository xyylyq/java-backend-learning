package com.liuyuqi.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();

        // 猜测1-100之间的一个随机数
        int number = r.nextInt(100) - 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入您猜测的数字：");
            int guessNumber = sc.nextInt();
            if (guessNumber < number) {
                System.out.println("您猜测的数字过小");
            } else if (guessNumber > number) {
                System.out.println("您猜测的数字过大");
            } else {
                System.out.println("恭喜您，猜测正确");
                break;
            }
        }
    }
}
