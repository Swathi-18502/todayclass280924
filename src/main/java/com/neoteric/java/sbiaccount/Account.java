package com.neoteric.java.sbiaccount;

import com.neoteric.java.atm.User;

public class Account {

    public int accountNumber;


    public String accountHolder;
    public double balance;
    public String accountType;


    // public Account (){

    // }
     public Account(String accountHolder,String accountType,int accountNumber,double balance) {

         this.accountType=accountType;
         this.accountHolder=accountHolder;
         this.accountNumber=accountNumber;
         this.balance=balance;



    }



}