package com.neoteric.java.rapidobooking;

import java.util.Date;

public class JobTaskMapping {

    public String taskid;

    public  String vehicleid;

    public String startTime;

    public String endtime;

    @Override
    public String toString() {
        return "JobTaskMapping{" +
                "taskid='" + taskid + '\'' +
                ", vehicleid='" + vehicleid + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}
