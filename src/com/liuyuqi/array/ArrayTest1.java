package com.liuyuqi.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        // 要求输入五名员工的工号，并最终输出随机的工号序列
        // 录入五名员工的工号
        int[] codes = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第" + (i + 1) + "名员工的工号：");
            int curCode = sc.nextInt();
            codes[i] = curCode;
        }

        Random r = new Random();
        // 随机产生一个索引值并将对应位置的元素与当前遍历到的元素交换
        for (int j = 0; j < codes.length; j++) {
            int index = r.nextInt(5);
            int temp = codes[index];
            codes[index] = codes[j];
            codes[j] = temp;
        }

        System.out.println("随机输出员工工号的序列为：");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
