package com.neoteric.java.ticket;

public class Ticket {
    public String Adhar;
    public String gender;
    public int Amount;
    public boolean Buspass;

    public  Ticket(String gender) {
        this.gender = gender;
    }
    public  Ticket(String gender, String Adhar) {
        this.gender=gender;

        this.Adhar=Adhar;

    }
    public Ticket(String gender,int Amount){
        this.gender=gender;
        this.Amount=Amount;


    }
    public Ticket(boolean Buspass){
        this.Buspass=Buspass;


}







}
