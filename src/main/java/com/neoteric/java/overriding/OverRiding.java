package com.neoteric.java.overriding;

public class OverRiding extends MethodeOverRiding{
    @Override
    public <E,N>void output(E element, N name){
        System.out.println(element);
    }
}
