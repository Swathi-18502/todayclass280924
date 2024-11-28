package com.neoteric.java.generics;

public class StringDataProcessor extends DataProcessor{

    @Override
    public <E> void processorData(E element) {
        System.out.println("StringDataProcessor: Specialized processing for Integers.");

        if(element instanceof Integer) {
            System.out.println("processed Integer Data:" + ((Integer) element) * 10);

        }else {
            //Default bahavior for non-interger element
            super.processorData(element);
        }
    }
}
