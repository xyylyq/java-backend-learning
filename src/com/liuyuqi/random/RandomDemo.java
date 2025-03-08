package com.liuyuqi.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

//        生成0-9的随机数
/*        int number = r.nextInt(10);

        System.out.println(number);*/

//        生成1-10的随机数
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10) + 1;
            System.out.println(number);
        }
    }
}
