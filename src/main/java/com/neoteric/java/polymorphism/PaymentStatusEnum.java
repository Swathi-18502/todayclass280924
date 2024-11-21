package com.neoteric.java.polymorphism;

public enum PaymentStatusEnum {

    SUCCESS("Transaction is success"),


    FAILED("Transaction is failed"),

    PENDING("Transaction is in-progress");

    private String label;


    PaymentStatusEnum(String label) {

        this.label = label;
    }

    public String getlabel(){
        return label;
    }

    public void setlabel(String label){
        this.label = label;
    }

}