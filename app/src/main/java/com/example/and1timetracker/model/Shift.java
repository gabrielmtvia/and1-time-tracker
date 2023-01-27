package com.example.and1timetracker.model;

import java.util.Date;

public class Shift {

    private Date date;
    private String startTime;
    private String endTime;
    private String unpaidBreak;
    private double hourlyPay;
    private double totalTime;


    public Shift(Date date, String startTime, String endTime, String unpaidBreak) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.unpaidBreak = unpaidBreak;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

}
