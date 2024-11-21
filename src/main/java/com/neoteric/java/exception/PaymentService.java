package com.neoteric.java.exception;public class PaymentService {
    static   int seats =10;


    public String payment(int numberOfTickets ) throws InsufficientBalanceException{
        try {

            if (numberOfTickets > 5) {
                throw new InsufficientBalanceException(TransferEnum.NSUFFICIENT_BALANCE.getCode(), TransferEnum.NSUFFICIENT_BALANCE.getLabel());
            }
        }catch (InsufficientBalanceException e){
            System.out.println(" Exception InsufficientBalanceException occurred "+e);
            throw  e;
        }catch (Exception e){
            System.out.println(" Exception occurred "+e);
            throw  e;
        }
        return  "SUCCESS";
    }
}

