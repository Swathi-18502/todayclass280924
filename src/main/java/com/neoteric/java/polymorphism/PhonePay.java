package com.neoteric.java.polymorphism;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PhonePay implements UPIPayments{

    public static Map<String,Double> accountBalanceMap = new HashMap<>();

   public static Map<String, ArrayList<Payments>> accountHistoryMap =new HashMap<>();

    static {
        accountBalanceMap.put("7382321152",10000.0);
        accountBalanceMap.put("9704652469",5000.0);

    }
    BiPredicate<String,Double> balanceCheck = (accountNumber,amt) ->{
        Double accountBalance = accountBalanceMap.get(accountNumber);
        if (accountBalance > amt) {
            return true;

        }else {
            return false;
        }
    };



    @Override
    public Payments transfer(String fromMobileNumber, String toNumber, Double amount) {
        Payments p = new Payments();


        if (balanceCheck.test(fromMobileNumber, amount)) {

            Double fromaccountBalance = accountBalanceMap.get(fromMobileNumber);
            Double toAccountBalance = accountBalanceMap.get(toNumber);

            Double fromTotalBalance = fromaccountBalance - amount;
            Double toTotalBalance = toAccountBalance + amount;
            accountBalanceMap.put(fromMobileNumber, fromTotalBalance);
            accountBalanceMap.put(toNumber, toTotalBalance);
            p.setStatus(PaymentStatusEnum.SUCCESS.getlabel());
            p.setTransactionid(UUID.randomUUID().toString());
            p.setUter(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());


            ArrayList<Payments> paymentsArrayList = accountHistoryMap.get(fromMobileNumber);

            if (paymentsArrayList !=null) {
                paymentsArrayList.add(p);
            }else {
                paymentsArrayList = new ArrayList<Payments>();
                paymentsArrayList.add(p);
                accountHistoryMap.put(fromMobileNumber,paymentsArrayList);

            }

        } else {
            p.setStatus(PaymentStatusEnum.FAILED.getlabel());
            p.setTransactionid(UUID.randomUUID().toString());
            p.setUter(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());
        }
return p;

    }
}
