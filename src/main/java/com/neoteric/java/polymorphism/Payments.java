package com.neoteric.java.polymorphism;

import java.util.Date;

public class Payments {

    public String Transactionid;

    public String uter;

    public String status;

    public Date TransactionDate;

    public String getTransactionid() {
        return Transactionid;
    }

    public void setTransactionid(String transactionid) {
        Transactionid = transactionid;
    }

    public String getUter() {
        return uter;
    }

    public void setUter(String uter) {
        this.uter = uter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        TransactionDate = transactionDate;
    }
}
