package com.neoteric.java.rapidobooking;

public class Driver {
     public String drivername;

     public String mobileNo;

     public  String insurance;

     public Insurance driverinsurance;

     @Override
     public String toString() {
          return "Driver{" +
                  "drivername='" + drivername + '\'' +
                  ", mobileNo='" + mobileNo + '\'' +
                  ", insurance='" + insurance + '\'' +
                  ", driverinsurance=" + driverinsurance +
                  '}';
     }
}
