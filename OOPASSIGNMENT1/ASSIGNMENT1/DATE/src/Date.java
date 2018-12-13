package com.company;
public class Date {
    int year;
    int month;
    int day;

    public Date(int yr, int mth, int dy) {
        year = yr;
        month = mth;
        day = dy;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return "Date :" + Integer.toString(this.day) + "/" + Integer.toString(this.month) + "/" + Integer.toString(this.year);
    }

    public void setDate(int year, int month, int day) {
        if (year < 1000 && year > 9999) {
            System.out.println("Invalid year");
        }
        if (month < 1 && month > 12) {
            System.out.println("Invalid month");
        }
        if (day < 1 && day > 31) {
            System.out.println("Invalid day");
        }
    }
}