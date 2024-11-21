package com.neoteric.java.rapidobooking;

public class Task {

    public String userid;

    public Location fromlocation;

    public  Location tolocation;


    @Override
    public String toString() {
        return "Task{" +
                "userid='" + userid + '\'' +
                ", fromlocation=" + fromlocation +
                ", tolocation=" + tolocation +
                '}';
    }
}
