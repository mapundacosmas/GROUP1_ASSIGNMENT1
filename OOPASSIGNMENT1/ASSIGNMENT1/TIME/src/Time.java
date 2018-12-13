package com.company;
public class Time {
    private int second=0;
    private int minute=0;
    private int hour=0;

    public Time() {

    }
    public Time(int sec,int min,int hr)
    {
        second=sec;
        minute=min;
        hour=hr;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString()
    {
        return "Time:" +Integer.toString(this.hour)+ ":" + Integer.toString(this.minute) +":" + Integer.toString(this.second);

    }



}
