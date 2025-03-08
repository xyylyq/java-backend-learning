package com.liuyuqi.scanner;

import java.util.Scanner;

/**
 * @author liuyuqi
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的名字：");

        String name = sc.next();

        System.out.println("请输入您的年龄：");

        int age = sc.nextInt();

        System.out.println("欢迎您，" + name + "。您的年龄为：" + age);
    }
}
