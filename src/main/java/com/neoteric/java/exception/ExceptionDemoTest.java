package com.neoteric.java.exception;

public class ExceptionDemoTest {


        public static void main(String[] args)  {


            System.out.println("Hello World");
            try {
                ExceptionTest test = new ExceptionTest();
                test.calcualteWithfinally(2);

                System.out.println(" Ticket booking is done");
            }catch (Exception e){
                System.out.println(((InsufficientBalanceException)e).getCode()+"  "+e.getMessage());
            }

            System.out.println(" I am done calculation");


        }
    }

