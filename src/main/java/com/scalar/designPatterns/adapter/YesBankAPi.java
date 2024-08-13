package com.scalar.designPatterns.adapter;

public class YesBankAPi {
    private int accountNumber;
    private int money;

    YesBankAPi(){}

    YesBankAPi(int accountNumber, int money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public int addMoneyYesBankSpecific(int amount){
        this.money += amount;
        return money;
    }
}
