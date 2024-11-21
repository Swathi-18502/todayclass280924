package com.neoteric.java.atm;

import javax.xml.transform.Source;
import java.util.Date;

public class AccountValidationTest {

    public static void  main(String[]args){

        AccountService as = new AccountService();

        User sonuUser = new User();

        sonuUser.adharNumber="87654";
        sonuUser.mobileNumber="345678932";
        sonuUser.pan="ARZ8765";
        sonuUser.name="Sonu";


        Account sonuAccount = as.createAccount(sonuUser);

        System.out.println(" sonu Account number"+sonuAccount.accountNumber+" name "+sonuAccount.user.name);


        User raniUser = new User();

        raniUser.adharNumber="45678";
        raniUser.mobileNumber="738232552";
        raniUser.pan="RXZJ4FD3";
        raniUser.name="Rani";

        Account raniAccount = as. createAccount(raniUser);
        System.out.println("rani Account number"+raniAccount.accountNumber+"name"+raniAccount.user.name);




        Debitcard debitcard=new Debitcard();

        debitcard.atmNumber="ASG345";
        debitcard.name="sri";
        debitcard.fromDate=new Date();
        debitcard.toDate=new Date();
        debitcard.cvv="hgf";

    }
}
