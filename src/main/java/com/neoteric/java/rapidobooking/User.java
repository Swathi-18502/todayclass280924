package com.neoteric.java.rapidobooking;

public class User {


    public String name;

    public String mobileNo;


    public String emailId;

    public String userId;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
