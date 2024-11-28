package com.neoteric.java.ticket;

public class TicketTest {

    public static void main(String[] args){

        Ticket ticket1=new Ticket("female");
        ticket1.gender="female";


        Ticket adhar=new Ticket("female","");
        adhar.gender="female" ;
        adhar.Adhar="AdharCard";


        Ticket amount=new Ticket("female",50);
        amount.gender="female";
        amount.Amount=50 ;


        Ticket buspass=new Ticket(false);


        buspass.Buspass=false;



        System.out.println(adhar.gender);
        System.out.println(adhar.Adhar);

}





}

