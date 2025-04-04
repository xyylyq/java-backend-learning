package com.liuyuqi.atm;

/**
 * @author liuyuqi
 * 账户类
 */
public class Account {
    private String cardId; // 卡号
    private String userName; // 用户名
    private String sex; // 性别
    private String passWord; // 密码
    private double money; // 账户余额
    private double quotaMoney; // 取款限额

    public Account() {
    }

    public Account(String cardId, String userName, String sex, String passWord, double money, double quotaMoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.sex = sex;
        this.passWord = passWord;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
