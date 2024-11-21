package com.neoteric.java.rapidobooking;

public class Vehicle {

    public String  VehicleNo;

    public Insurance insurance;

    public VehicleTypeEnum vehicleType;

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleNo='" + VehicleNo + '\'' +
                ", insurance=" + insurance +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
