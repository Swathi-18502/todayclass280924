package com.neoteric.java.generics;

public class DataProcessor {
    public <E>void  processorData(E element){
        System.out.println("DataProcessor:" + element);

    }
}
