package com.neoteric.java.generics;

public class Main {
    public static void main(String[]args){

        DataProcessor dataProcessor= new DataProcessor();
        dataProcessor.processorData(18);
        dataProcessor.processorData("Hello Data");

        DataProcessor StringProcessor = new StringDataProcessor();
        StringProcessor.processorData("Hello String");
        StringProcessor.processorData(19);

        DataProcessor IntegerProcessor =new IntergerDataProcessor();
        IntegerProcessor.processorData(20);
        IntegerProcessor.processorData("Hello Integer");
    }
}
