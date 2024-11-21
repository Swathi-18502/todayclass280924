package com.neoteric.java.exception;

import com.neoteric.java.cyclicdependancy.A;

public class ExceptionTest {

        public void calcualteWithfinally(int numberofTicket) throws Exception {
            String status = null;
            try {
                System.out.println(" Available "+PaymentService.seats);

                PaymentService.seats =  PaymentService.seats-numberofTicket;

                System.out.println(" Available "+PaymentService.seats);

                PaymentService  paymentService = new PaymentService();
                status =  paymentService.payment(numberofTicket);

            }finally {
                if (!"SUCCESS".equals(status)){
                    PaymentService.seats =  PaymentService.seats+numberofTicket;
                }
                System.out.println(" from finally calcualteWithfinally1111 ");
                System.out.println(" post payment Available "+PaymentService.seats);
            }

            System.out.println(" post finally  block");
        }
    }



