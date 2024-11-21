package com.neoteric.java.atm;

import java.util.Date;
import java.util.UUID;

public class AccountService {

    public Account createAccount(User user){

        Account a =new Account();

        a.accountNumber= UUID.randomUUID().toString();

a.user=user;
        return a;


    }

    public Debitcard issueDebitcard(Account account){
        Debitcard debitcard=new Debitcard();

        debitcard.atmNumber=UUID.randomUUID().toString();
        debitcard.account=account;

        return debitcard;






    }
}
