package com.neoteric.java.overloading;

public class MethodOverLoading {
    public <T> void  output(T value){
        System.out.println("Number");
    }

    public <T,U> void output(T value,U value2){

        System.out.println("hi");
    }

    public <T,U,V> void output(T value3,U value4,V value5){
        System.out.println("Hello");
    }
}
