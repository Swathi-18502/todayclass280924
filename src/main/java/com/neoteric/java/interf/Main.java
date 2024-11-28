package com.neoteric.java.interf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value");
        int s=sc.nextInt();
        InterfaceJava interfaceJava= new InterfaceJava();
        interfaceJava.numbering(s); // s is for used to store scanner input values
    }
}
