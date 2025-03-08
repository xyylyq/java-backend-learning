package com.liuyuqi.array;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        // 静态数组
        int[] arr = new int[]{1, 2, 3};

        // 动态数组
        double[] score = new double[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数：");
            double curScore = sc.nextDouble();
            score[i] = curScore;
        }

        double sum = 0;
        for (int j = 0; j < score.length; j++) {
            sum += score[j];
        }
        System.out.println("最终的平均分为：" + sum / score.length);
    }
}
