package com.neoteric.java.polymorphism;

public class InterfaceTest {


    public static void main(String[]args){
        UPIPayments payments = new PhonePay();

        Payments Pay = payments.transfer("7382321152","9704652469",30000.0);

        System.out.println(Pay.getTransactionid()+"status"+Pay.getStatus()+"uter"+Pay.getUter()+"Date"+Pay.TransactionDate);

        System.out.println("Balance of from account"+PhonePay.accountBalanceMap.get("7382321152"));
        System.out.println("To account Balance"+PhonePay.accountBalanceMap.get("9704652469"));





    }
}
