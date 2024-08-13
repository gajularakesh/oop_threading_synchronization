package com.scalar.designPatterns.adapter;

public class IciciBankApi {
    private int accountNumber;
    private int money ;

    IciciBankApi(){}

    IciciBankApi(int accountNumber, int money) {
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

    public int addMoneyIciciBankSpecific(int accountNumber,int amount){
        this.money += amount;
        return money;
    }
}
