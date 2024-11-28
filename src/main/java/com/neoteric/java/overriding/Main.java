package com.neoteric.java.overriding;

public class Main {

    public static void main(String[] args){

        MethodeOverRiding methodeOverRiding=new MethodeOverRiding();

        MethodeOverRiding subClass=new OverRiding();

        OverRiding subClass1= new OverRiding();

        methodeOverRiding.output(2,32);
        subClass.output(4,3);
        subClass1.output(8,4);


    }
}
