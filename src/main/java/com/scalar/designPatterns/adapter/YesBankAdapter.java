package com.scalar.designPatterns.adapter;

public class YesBankAdapter implements BankApi{

    YesBankAPi yesBankAPi =  new YesBankAPi();


    public int addMoney(int accountNumber,int amount) {

        return yesBankAPi.addMoneyYesBankSpecific(amount);
    }

}
