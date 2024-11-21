package com.neoteric.java.rapidobooking;

import java.util.Date;

public class Testclass {

    public static void main(String[] args) {

        User user= new User();
        user.name="swathi";
        user.mobileNo="23456789";
        user.emailId="swa@gmail.com";
        user.userId="swa";


        Insurance driverinsurance=new Insurance();
        driverinsurance.Id="3456";
        driverinsurance.insuranceNo="dfg";


        Location location=new Location();
        location.UserId="sdfg";
        location.longitude="Kphb";
        location.latitude="jntu";

        JobTaskMapping jobTaskMapping=new JobTaskMapping();
        jobTaskMapping.startTime="29/9/24";
        jobTaskMapping.endtime="10/10/24";
        jobTaskMapping.taskid="FG456J";
        jobTaskMapping.vehicleid="5448";

        Driver driver=new Driver();
        driver.drivername="sonu";
        driver.mobileNo="98765432";
        driver.insurance="jhgfd";
        driver.driverinsurance=driverinsurance;


        Task task=new Task();
        task.userid="87665";
        task.fromlocation=location;
        task.tolocation=location;


        Insurance vehicleinsurance=new Insurance();
        vehicleinsurance.insuranceNo="4567";
        vehicleinsurance.Id="sonu";


        Vehicle vehicle=new Vehicle();

        vehicle.VehicleNo="8899";
        VehicleTypeEnum dfgh=VehicleTypeEnum.AUTO;
        vehicle.vehicleType=dfgh;
        vehicle.insurance=vehicleinsurance;

        System.out.println(vehicle);












    }
}
