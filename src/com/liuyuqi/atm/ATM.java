package com.liuyuqi.atm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class ATM {
    // 创建账户集合
    ArrayList<Account> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 启动系统首页
    public void start(){
        while (true) {
            System.out.println("======欢迎进入ATM系统========");
            System.out.println("下面是您可以在本系统中进行的操作：");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("3.退出系统");
            System.out.println("请输入您想进行的操作编号：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 用户登录
                    login();
                    break;
                case 2:
                    // 用户开户
                    register();
                    break;
                case 3:
                    //退出系统
                    System.out.println("欢迎您下次使用");
                    System.exit(0);
                default:
                    System.out.println("您输入的操作编号有误，请重新输入");
                    break;
            }
        }
    }

    // 用户登录
    public void login(){
        System.out.println("请输入您的账户用户名：");
        String loginUserName = sc.next();
        System.out.println("请输入您的账户密码：");
        String loginPassWord = sc.next();
        for (int i = 0; i < accounts.size(); i++) {
            if (loginUserName.equals(accounts.get(i).getUserName()) && loginPassWord.equals(accounts.get(i).getPassWord())){
                System.out.println("恭喜您，登录成功");
            }
        }
        System.out.println("您输入的账户用户名或密码有误");
    }

    // 用户开户(注册)
    public void register(){
        Account account = new Account();
        account.setCardId(String.valueOf(UUID.randomUUID()));

        System.out.println("请输入您的账户用户名:");
        account.setUserName(sc.next());

        while (true) {
            System.out.println("请输入您的性别(仅输入男或女即可)：");
            String curSex = sc.next();
            if (!(curSex.equals("男") || curSex.equals("女"))) {
                System.out.println("您输入的性别格式有误，请重新输入");
                continue;
            }
            account.setSex(curSex);
            break;
        }

        while (true) {
            System.out.println("请输入您的账户密码：");
            String curPassWord = sc.next();
            System.out.println("请确认您的账户密码：");
            if (!sc.next().equals(curPassWord)){
                System.out.println("您两次输入的密码不一致，请重新输入");
                continue;
            }
            account.setPassWord(curPassWord);
            break;
        }

        account.setMoney(0);

        System.out.println("请设置账户每次取钱额度：");
        account.setQuotaMoney(sc.nextInt());

        System.out.println("恭喜您," + account.getUserName() + "您已成功开户，卡号为：" + account.getCardId() + "，请您妥善保存您的银行卡");
    }
}
